package maven.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Entity
@Component("product")
@Inheritance(strategy=InheritanceType.JOINED)
public class Product 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long pid;
private String quantity;
private String price;

@ManyToOne
private Vendor vendor;
@ManyToOne
private SubCategory subCategory;


public SubCategory getSubCategory() {
	return subCategory;
}
public void setSubCategory(SubCategory subCategory) {
	this.subCategory = subCategory;
}
public Vendor getVendor() {
	return vendor;
}
public void setVendor(Vendor vendor) {
	this.vendor = vendor;
}
public long getPid() {
	return pid;
}
public void setPid(long pid) {
	this.pid = pid;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", quantity=" + quantity + ", price=" + price + ", vendor=" + vendor + "]";
}


}
