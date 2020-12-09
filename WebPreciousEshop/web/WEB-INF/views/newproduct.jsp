<%-- 
    Document   : newproduct
    Created on : Dec 9, 2020, 10:01:18 AM
    Author     : konstantinos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Product - Precious Eshop</title>
    </head>
    <body>
        <h1>New Product Data</h1>
        <form action="<%=request.getContextPath()%>/product" method="POST">
            Name<input type="text" name="name" value="" /><br/>
            Price<input type="text" name="price" value="" size="4"/><br/>
            Quantity<input type="text" name="quantity" value="" /><br/>
            <input type="submit" value="Insert" />
        </form>
    </body>
</html>
