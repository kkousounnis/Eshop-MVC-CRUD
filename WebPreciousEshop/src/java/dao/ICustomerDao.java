/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import services.*;
import java.util.List;
import models.Customer;

/**
 *
 * @author konstantinos
 */
public interface ICustomerDao {
    public int insert(Customer customer, String tablename);
    public int update (int customerId);
    public int update (String firstname, String lastname);
    public int update (String email);
    public int delete (int customerId);
    public List<Customer> all();
    public Customer getCustomerById(int id);
}
