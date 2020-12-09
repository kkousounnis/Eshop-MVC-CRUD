/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

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
    
}
