/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.CustomerService;
import services.ResultService;

/**
 *
 * @author konstantinos
 */
@WebServlet(name = "customer", urlPatterns = {"/customer"})
public class Customer extends HttpServlet {

    CustomerService customerService;
    ResultService resultService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (customerService == null) {
            customerService = new CustomerService();
        }
        if (resultService == null) {
            resultService = new ResultService();
        }
        String action = req.getParameter("action");
        if (action.equals("insertcustomer")) {
            RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/views/newcustomer.jsp");
            rd.forward(req, resp);
        }
        if (action.equals("customerlist")) {
            resultService.showAllResultC(req, resp, customerService.all());
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (customerService == null) {
            customerService = new CustomerService();
        }
        if (resultService == null) {
            resultService = new ResultService();
        }

        models.Customer customer = new models.Customer();
        customer.setFirstName(req.getParameter("firstname"));
        customer.setLastName(req.getParameter("lastname"));
        customer.setTel(req.getParameter("telephonenumber"));
        customer.setEmail(req.getParameter("email"));
        int result = customerService.insert(customer);
        resultService.showInsertResult(req, resp, result, customer);

    }

}
