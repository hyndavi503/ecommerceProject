package maven.demo.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import maven.demo.model.Product;
@Component
@Transactional
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private SessionFactory factory;
	
	public boolean addProduct(Product product) {
		try
		{
			factory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception e) {
		return false;
		}
	}

	public boolean deleteProducts(Product product) {
	try
	{
		factory.getCurrentSession().delete(product);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
	}

	public boolean updateProducts(Product product) {
		try
		{
			factory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
