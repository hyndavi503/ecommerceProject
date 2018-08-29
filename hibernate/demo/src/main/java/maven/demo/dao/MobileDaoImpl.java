package maven.demo.dao;

import javax.persistence.Inheritance;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import maven.demo.model.Mobile;

@Component
@Transactional

public class MobileDaoImpl implements MobileDao{

	@Autowired
	private SessionFactory factory;
	
	public boolean addMobile(Mobile mobile) {
		try
		{
			factory.getCurrentSession().save(mobile);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public boolean deleteMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		try
		{
			factory.getCurrentSession().delete(mobile);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

}
