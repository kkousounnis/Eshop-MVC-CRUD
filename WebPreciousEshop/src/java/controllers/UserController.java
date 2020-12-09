/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Customer;
import models.Product;
import dao.Database;

/**
 *
 * @author root
 */
@WebServlet(name = "UserController", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Customer customer = new Customer();
        Product product = new Product();
        Database db = new Database();
        response.setContentType("text/html;charset=UTF-8"); // servlet
        try (PrintWriter out = response.getWriter()) {
            /* for the browser */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Administration Panel - Precious EShop</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Administration Panel - Precious EShop" + "</h1>");

            customer.setFirstName(request.getParameter("firstname"));
            customer.setLastName(request.getParameter("lastname"));
            customer.setTel(request.getParameter("telephonenumber"));
            customer.setEmail(request.getParameter("email"));
            out.print(customer.getFirstName());
            product.setName(request.getParameter("productname"));
            product.setPrice(parseDouble(request.getParameter("productprice")));
            product.setQuantity(parseInt(request.getParameter("productquantity")));
            out.print(customer);
            //out.print(db.insertCustomer((customer), "customers"));
            out.print(product);
           // out.print(db.insertProduct((product), "products"));

            out.println("</body>");
            out.println("</html>");

            
        }
    }

}
