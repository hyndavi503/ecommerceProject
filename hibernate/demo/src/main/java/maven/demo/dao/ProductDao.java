package maven.demo.dao;

import maven.demo.model.Product;

public interface ProductDao {
public boolean addProduct(Product product);
public abstract boolean deleteProducts(Product product);
public abstract boolean updateProducts(Product product);

}
