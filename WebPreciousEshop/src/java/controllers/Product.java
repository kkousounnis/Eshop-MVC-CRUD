package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.ProductService;

@WebServlet(name = "product", urlPatterns = {"/product"})
public class Product extends HttpServlet{
    ProductService productService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(productService == null) productService = new ProductService();
        int  result = productService.insert(new models.Product("HDD", 120, 2));
        resp.setContentType("text/html;charset=UTF-8"); // servlet
        try (PrintWriter out = resp.getWriter()) {
            /* for the browser */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Precious EShop</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Inserted Records for Product: " + result);
            out.println("</body>");
            out.println("</html>");

        }
    }
    
    
}
