package maven.demo.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import maven.demo.model.Vendor;

@Component
@Transactional
public class VendorDaoImpl implements VendorDao
{
	@Autowired
	private SessionFactory factory;

	public boolean addVendor(Vendor vendor) {
		try {
		factory.getCurrentSession().save(vendor);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean deleteVendor(Vendor vendor) {
        try
        {
            factory.getCurrentSession().delete(vendor);
            
            return true;
        }
        
        catch (Exception e)
        {    
            return false;
            // TODO: handle exception
        }

    }


 public boolean updateVendor(Vendor vendor) 
 {
        try
        {
           factory.getCurrentSession().update(vendor);
            return true;
        }
        catch (Exception e)
        {    
            return false;
            // TODO: handle exception
        }

}

@Override
public Vendor getVendor(long vid) {
	try
	{
	return factory.getCurrentSession().get(Vendor.class,vid);
	}
	catch(Exception e)
	{
	return null;
	}
}


@Override
public Vendor login(String email,String password) 
{
	Query<Vendor> query=factory.getCurrentSession().createQuery("from Vendor where email=:email and password=:password",Vendor.class);
	query.setParameter("email", email);
	query.setParameter("password", password);
	return query.getSingleResult(); 
}
}

