/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.CustomerService;



/**
 *
 * @author konstantinos
 */
@WebServlet(name = "customer", urlPatterns = {"/customer"})
public class Customer extends HttpServlet {
    CustomerService customerService;
     
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(customerService == null) customerService = new CustomerService();
        int  result = customerService.insert(new models.Customer("Bruce1", "Lee", "2222", "bruce@kick.com"));
        int  deleteresult =  customerService.delete(51);
        List<models.Customer> customer= customerService.all();
        resp.setContentType("text/html;charset=UTF-8"); // servlet
        try (PrintWriter out = resp.getWriter()) {
            /* for the browser */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Precious EShop</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Inserted Records for Customer: " + result);
            out.println("<p>Delete Record of Customer with id 51: " + result);
            out.println("<p>Customer List: " + customer);
            out.println("</body>");
            out.println("</html>");

        }
    }
    
    
}
