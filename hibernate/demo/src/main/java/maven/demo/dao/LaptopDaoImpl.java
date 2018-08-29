package maven.demo.dao;

import javax.persistence.Inheritance;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import maven.demo.model.Laptop;

@Component
@Transactional

public class LaptopDaoImpl implements LaptopDao{

	@Autowired
	private SessionFactory factory;
	
	public boolean addLaptop(Laptop laptop) 
	{
	try
	{
		factory.getCurrentSession().save(laptop);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
	}

	public boolean deleteLaptop(Laptop laptop) {
		try
		{
			factory.getCurrentSession().delete(laptop);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	
	}

}
