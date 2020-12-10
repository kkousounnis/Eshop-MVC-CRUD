<%-- 
    Document   : newcustomer
    Created on : Dec 9, 2020, 9:55:53 AM
    Author     : George.Pasparakis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Product - Precious EShop</title>
        <link rel='stylesheet' type='text/css' href='static/css/bootstrap.min.css'>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <%@ include file="../../static/mymenu.jsp" %>
                    <h1>New Product Data</h1>
                    <form name="newproduct" action="<%= request.getContextPath()%>/product" method="POST">

                        <div class="form-group">
                            Name:       <input class="form-control" autocomplete="off" type="text" name="name" value="" /><br />
                        </div>
                        <div class="form-group">
                            Price:      <input class="form-control" autocomplete="off" type="text" name="price" value="" size="6" maxlength="8" /><br/>
                        </div>
                        <div class="form-group">
                            Quantity:   <input class="form-control" autocomplete="off" type="text" name="quantity" value="" size="6" maxlength="8" /><br />
                        </div>
                        <div class="form-group">
                            <input class="btn btn-primary" type="submit" value="Save Product" name="saveproduct" />
                        </div>
                    </form>
                </div>
            </div>
        </div>
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
