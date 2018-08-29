
package maven.demo;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



import maven.demo.dao.CategoryDao;
import maven.demo.dao.LaptopDao;
import maven.demo.dao.MobileDao;
import maven.demo.dao.ProductDao;
import maven.demo.dao.SubCategoryDao;
import maven.demo.dao.VendorDao;

import maven.demo.model.Category;
import maven.demo.model.Laptop;
import maven.demo.model.Laptop;
import maven.demo.model.Mobile;
import maven.demo.model.Product;
import maven.demo.model.SubCategory;
import maven.demo.model.Vendor;


@SpringJUnitConfig(classes=(HibernateConfig.class))
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest 
    {
					@Autowired
					private Vendor vendor;
					@Autowired
					private VendorDao vendorDao;
					@Autowired
					private Laptop laptop;
					@Autowired
					private LaptopDao laptopDao;
					@Autowired
					private Mobile mobile;
					@Autowired
					private MobileDao mobileDao;
					@Autowired
					private CategoryDao categoryDao;
					@Autowired
					private Category category;
					@Autowired
					private SubCategory subCategory;
					@Autowired
					private SubCategoryDao subCategoryDao;
					@Autowired
					private Product product;
					@Autowired
					private ProductDao productDao;
	
@Before
public  void setUp()
{
	//AnnotationConfigApplicationContext context=new  AnnotationConfigApplicationContext(HibernateConfig.class);
	vendor.setName("hyndu");
	vendor.setEmail("hyndu@gmail.com");
	vendor.setMobile("9966293705");
	vendor.setCompanyname("Flipkart");
	vendor.setPassword("hyndavi");
		
	laptop.setRam(4);
	laptop.setRom(4);
	laptop.setOs("windows 8");
	laptop.setProcessor("i5");
	
	mobile.setRam(4);
	mobile.setRom(4);
	mobile.setFrontCam(12);
	mobile.setBackCam(12);
	mobile.setProcessor("64gb");
}
					
					 @Test
					    public void addVendorTest()
					    
					    {
					        assertEquals("Test vendor adding Failed",true,vendorDao.addVendor(vendor));
					        //deleteVendor();
					        
					    }
					 @Test
					    public void getVendor()
					    {
						 vendorDao.addVendor(vendor);
						 assertEquals("test is failed",vendor,vendorDao.getVendor(vendor.getVid()));
					    }
					 
						@Test
					    public void updateVendor()
					    {
					        vendorDao.addVendor(vendor);
					        
					        vendor.setName("shyam");
					        vendor.setEmail("shyam@gmail.com");
					        vendor.setMobile("9666069549");
					        vendor.setCompanyname("amazon");
					        assertEquals("test vendor updation failed",true,vendorDao.updateVendor(vendor));
					        //deleteVendor();
					    }
					    
				       @After
					   public void deleteVendor()
					    {
					        assertEquals("test deletion is failed",true,vendorDao.deleteVendor(vendor));
					    }
						

					  /* @Test
					    public void addAddress()
					    {
					    vendorDao.addVendor(vendor);
					        assertEquals("Test Address Insertion failed",true,addressDao.addAddress(address));
					       deleteAddress();
					    }

					 	public void deleteAddress()
					 	{
				        addressDao.deleteAddress(address);
					    }
					    public void updateAddress()
					    {
					        assertEquals("updation completed",true,addressDao.updateAddress(address));
					    }
					*/
					    /*@Test
					    public void addProducts()
					    {
					     vendorDao.addVendor(vendor);
					        assertEquals("Test product Insertion failed",true,productDao.addProduct(product));
					       deleteProducts();
					    }

					    public void deleteProducts()
					    {
					        productDao.deleteProducts(product);
					    }
					    public void updateProducts()
					    {
					    	assertEquals("updation completed",true,productDao.updateProducts(product));
					    }*/
			
					
					  @Test
					    public void addLaptop()
					    {
					    	subCategory=subCategoryDao.getSubCategory(1);
					    	vendorDao.addVendor(vendor);
					    	laptop.setSubCategory(subCategory);
					    	laptop.setVendor(vendor);
					    	laptop.setPrice("10000");
					    	laptop.setQuantity("2");
					    	assertEquals("laptop insertion failed",true,laptopDao.addLaptop(laptop));
					    	
					    	deleteLaptop();
					    	
					    }
					   public void deleteLaptop()
					    {
					    	assertEquals("laptop is deleted",true,laptopDao.deleteLaptop(laptop));
					    }
					   /*@Test
					    public void addMobile()
					    {
					    
					    	assertEquals("mobile insertion failed",true,mobileDao.addMobile(mobile));
					    }
					    
	*/
					     
					    
}