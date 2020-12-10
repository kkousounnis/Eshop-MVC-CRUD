package controllers;

import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.ProductService;
import services.ResultService;

@WebServlet(name = "product", urlPatterns = {"/product", "/productlist"})
public class Product extends HttpServlet {

    ProductService productService;
    ResultService resultService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (productService == null) {
            productService = new ProductService();
        }
        if (resultService == null) {
            resultService = new ResultService();
        }
        String action = req.getParameter("action");
        if (action.equals("insertproduct")) {
            RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/views/newproduct.jsp");
            rd.forward(req, resp);
        }
        if (action.equals("productlist")) {            
            resultService.showAllResultP(req, resp, productService.all());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (productService == null) {
            productService = new ProductService();
        }
        if (resultService == null) {
            resultService = new ResultService();
        }

        models.Product product = new models.Product();
        product.setName(req.getParameter("name"));
        product.setPrice(parseDouble(req.getParameter("price")));
        product.setQuantity(parseInt(req.getParameter("quantity")));
        int result = productService.insert(product);
        resultService.showInsertResult(req, resp, result, product);

    }

}
