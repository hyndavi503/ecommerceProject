package maven.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class SubCategory 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long subCategoryId;
private String subCategoryName;

@ManyToOne
private Category category;

public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public long getSubCategoryId() {
	return subCategoryId;
}
public void setSubCategoryId(long subCategoryId) {
	this.subCategoryId = subCategoryId;
}
public String getSubCategoryName() {
	return subCategoryName;
}
public void setSubCategoryName(String subCategoryName) {
	this.subCategoryName = subCategoryName;
}
@Override
public String toString() {
	return "SubCategory [subCategoryId=" + subCategoryId + ", subCategoryName=" + subCategoryName + ", category="
			+ category + "]";
}

}
