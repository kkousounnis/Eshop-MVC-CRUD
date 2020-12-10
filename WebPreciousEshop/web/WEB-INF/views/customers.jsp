<%-- 
    Document   : customers
    Created on : Dec 11, 2020, 1:34:46 AM
    Author     : konstantinos
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        


        <table border=1>
            <thead>
                <tr>
                    <th>ProductId</th>
                    <th>ProductName</th>
                    <th>Price</th>
                    <th>Quantity</th>     
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${requestScope.Products}" var="Product">
                    <tr>
                        <td><c:out value="${Product.productid}" /></td>
                        <td><c:out value="${Product.name}" /></td>
                        <td><c:out value="${Product.price}" /></td>
                        <td><c:out value="${Product.quantity}" /></td>
                    </c:forEach>
            </tbody> 
        </table>
        <form action="orderdetail" method="POST">          
            <br/>
            Specify customer id
            <br/>
            <input type="number" name="customerid" value="" />
            <br/>
            Specify product id
            <br/>
            <input type="number" name="productid" value="" />
            <br/>
            Specify product quantiy
            <br/>
            <input type="number" name="quantity" value="" />
            <br/>
            Specify product price
            <br/>
            <input type="number" name="price" value="" />
            <br/>
            <input type="submit" value="order" />
        </form>

    </body>
</html>