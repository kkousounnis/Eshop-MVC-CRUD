package services;

import dao.CustomerDao;
import java.util.List;
import models.Customer;

public class CustomerService implements ICustomerService{
    CustomerDao customerDao;
    @Override
    public int insert(Customer customer) {
        if(customerDao == null) customerDao = new CustomerDao();
        return customerDao.insert(customer, "customers");
    }

    @Override
    public int update(int customerId) {
        if(customerDao == null) customerDao = new CustomerDao();
        return customerDao.update(customerId);
    }

    @Override
    public int update(String firstname, String lastname) {
         if(customerDao == null) customerDao = new CustomerDao();
        return customerDao.update(firstname, lastname);
    }

    @Override
    public int update(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int customerId) {
        if(customerDao == null) customerDao = new CustomerDao();
        return customerDao.delete(customerId);
    }

    @Override
    public List<Customer> all() {
        if(customerDao == null) customerDao = new CustomerDao();
        return customerDao.all();
    }

    @Override
    public Customer getCustomerById(int id) {
        if(customerDao == null) customerDao = new CustomerDao();
        return customerDao.getCustomerById(id);
    }
    
}
