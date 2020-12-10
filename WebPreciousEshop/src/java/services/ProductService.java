/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.ProductDao;
import java.util.List;
import models.Product;

/**
 *
 * @author konstantinos
 */
public class ProductService implements IProductService{
    ProductDao productDao;
    @Override
    public int insert(Product product) {
        if(productDao == null) productDao = new ProductDao();
        int result = productDao.insert(product, "products");
        return (result);
    }
    
    @Override
    public int update(int productId, Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(String name, double price, Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int delete(int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> all() {
        if(productDao == null) productDao = new ProductDao();
        return productDao.all();
    }

    @Override
    public Product getProductById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
