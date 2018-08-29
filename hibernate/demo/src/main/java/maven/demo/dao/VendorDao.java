package maven.demo.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import maven.demo.model.Vendor;




public interface VendorDao 
{
	public boolean addVendor(Vendor vendor);
    public abstract boolean deleteVendor(Vendor vendor);
    public abstract boolean updateVendor(Vendor vendor);
    public Vendor getVendor(long vid);
    public Vendor login(String email,String password);
}
