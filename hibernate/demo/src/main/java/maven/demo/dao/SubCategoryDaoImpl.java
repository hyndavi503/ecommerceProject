package maven.demo.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import maven.demo.model.SubCategory;
@Component
@Transactional
public class SubCategoryDaoImpl implements SubCategoryDao{
@Autowired
private SessionFactory sessionFactory;

public SubCategory getSubCategory(int subCategoryId) {
try {
return sessionFactory.getCurrentSession().get(SubCategory.class, subCategoryId);
}
catch(Exception e)
{
	return null;
}
}

	

}
