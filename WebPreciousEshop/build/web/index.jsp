<%-- 
    Document   : index
    Created on : Dec 7, 2020, 11:42:23 PM
    Author     : konstantinos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome - Precious eshop</title>
        <link rel='stylesheet' type='text/css' href='static/css/bootstrap.min.css'>
    </head>
    <body>
        <div class="container">
            <%@ include file="../../static/mymenu.jsp" %> 
            <h1>Welcome</h1>
            <jsp:useBean id = "date" class = "java.util.Date" />  

            <jsp:useBean id="product" class="models.Product" scope="session"/>

            <jsp:setProperty name="product" property="name" value="LLL" />
            <% product.setName("Makis");%>
            <p>The Product is <%=product.getName()%>
            <p>The date/time is <%= date%>


            <p>The Product is <%=product%>
        </div>

        <!--        <form action="/WebPreciousEshop/UserController" method="POST">
                    <br/>
                    <h3>Type Customer</h3>
                    <br/>
                    Type your first name :<input type="text" name="firstname" 
                                                 value="" />
                    <br/>
                    Type your last name :<input type="text" name="lastname" 
                                                value="" />
                    <br/>
                    Type your telephone number :<input type="number" name="telephonenumber"
                                                       value="" />
                    <br/>
                    Type your email :<input type="email" name="email" value="" />
                    <br/>
                    <br/>
                    <h3>Type Customer</h3>
                    <br/>
                    Type product name :<input type="text" name="productname" 
                                              value="" />
                    <br/>
                    Type product price :<input type="number" name="productprice" 
                                               value="" />
                    <br/>
                    Type product quantity :<input type="number" name="productquantity" 
                                                  value="" />
                    <br/>
                    <input type="submit" value="Insert Database" />
                </form>-->
    </body>
    <script src="js/jquery.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
            integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
    crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
            integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
    crossorigin="anonymous"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/script.js"></script>  
</html>
