package maven.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Category 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long categoryId;
private String categoryName;

@OneToMany(mappedBy="category")
private Set<SubCategory> subCategory;

public Set<SubCategory> getSubCategory() {
	return subCategory;
}
public void setSubCategory(Set<SubCategory> subCategory) {
	this.subCategory = subCategory;
}
public long getCategoryId() {
	return categoryId;
}
public void setCategoryId(long categoryId) {
	this.categoryId = categoryId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
@Override
public String toString() {
	return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", subCategory=" + subCategory
			+ "]";
}


}
