package maven.demo.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Entity
@Component("vendor")
public class Vendor 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long vid;
	@Column(unique=true)
	private String name;
	@Column(unique=true)
	private String email;
	@Column(unique=true)
	private String mobile;
	private String companyname;
	private String password;
	
@OneToMany(fetch = FetchType.EAGER,mappedBy="vendor")
    private Set<Product> Products;
    
public long getVid() 
{
	return vid;
}
public void setVid(long vid) 
{
	this.vid = vid;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public String getEmail() 
{
	return email;
}
public void setEmail(String email) 
{
	this.email = email;
}
public String getMobile() 
{
	return mobile;
}
public void setMobile(String mobile) 
{
	this.mobile = mobile;
}
public String getCompanyname() 
{
	return companyname;
}
public void setCompanyname(String companyname) 
{
	this.companyname = companyname;
}
@Override
public String toString() {
	return "Vendor [vid=" + vid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", companyname="
			+ companyname + ", password=" + password + ", Products=" + Products + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Vendor other = (Vendor) obj;
	
	if (companyname == null) {
		if (other.companyname != null)
			return false;
	} else if (!companyname.equals(other.companyname))
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (mobile == null) {
		if (other.mobile != null)
			return false;
	} else if (!mobile.equals(other.mobile))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (password == null) {
		if (other.password != null)
			return false;
	} else if (!password.equals(other.password))
		return false;
	
	return true;
}
}