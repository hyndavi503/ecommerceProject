package project.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import maven.demo.dao.VendorDao;
import maven.demo.model.Login;
import maven.demo.model.Vendor;

@Controller
public class HomeController 
{
	@Autowired
	private VendorDao vendorDao;
@RequestMapping("/")
public ModelAndView index()
{
	ModelAndView view=new ModelAndView("index");
	view.addObject("myName", "hyndavi");
	return view;
}
	
@RequestMapping("/aboutUs")
	public ModelAndView aboutUs()
	{
		ModelAndView modelAndView=new ModelAndView("aboutUs");
		modelAndView.addObject("number","9966293705");
		return modelAndView;
	}

@RequestMapping("contact")
public Model contact(Model model)
{
	model.addAttribute("address","guntur");
	return model;
}
@GetMapping("/signup")
public String signup(Model model)
{
	model.addAttribute("vendor", new Vendor());
	return "signup";
}
@PostMapping("/signup")
public String addVendor(@ModelAttribute("vendor") Vendor vendor)
{
	if(vendorDao.addVendor(vendor))
	{
		return "redirect:/login";
	}
	else
	{
		return "signup";
	}
}

@GetMapping("/login")
public String login(Model model)
{
	model.addAttribute("login", new Login());
	return "login";
}

@PostMapping("/login")
public String getVendor(@ModelAttribute("login") Login login,Model model)
{
	if(vendorDao.login(login.getEmail(),login.getPassword())!=null)
	{
		Vendor vendor=vendorDao.login(login.getEmail(), login.getPassword());
	model.addAttribute("profile",vendor);
		return "redirect:/profile";
	}
	else
	{
		return "login";
	}
}
@GetMapping("/profile")
public String profile(Model model)
{
	return "profile";
}
}
