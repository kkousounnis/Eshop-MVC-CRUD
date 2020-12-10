/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Customer;
import models.Product;

/**
 *
 * @author konstantinos
 */
public interface IResultService {
    void showInsertResult (HttpServletRequest req, HttpServletResponse resp, int errorCode, Product product);
    void showInsertResult(HttpServletRequest req, HttpServletResponse resp, int errorCode, Customer customer);
    void showAllResultP(HttpServletRequest req, HttpServletResponse resp, List<Product> products);
    void showAllResultC(HttpServletRequest req, HttpServletResponse resp, List<Customer> customers);
    
    
    
}
