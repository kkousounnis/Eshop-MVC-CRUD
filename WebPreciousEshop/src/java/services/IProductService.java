/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import models.Product;

/**
 *
 * @author konstantinos
 */
public interface IProductService {
    public int insert(Product product);
    public int update (int productId);
    public int update (String name);
    public int update (double price);
    public int delete (int quantity);
    public List<Product> all();
    public Product getProductById(int id);
    
}
