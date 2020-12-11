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
        <link rel='stylesheet' type='text/css' href='static/css/bootstrap.min.css'>
    </head>
    <body>

        <div class="container">
            <%@ include file="../../static/mymenu.jsp" %>
            <table border=1 class="table table-striped">
                <thead>
                    <tr>
                        <th>CustomerId</th>
                        <th>FirstName</th>
                        <th>LastName</th>
                        <th>TelephoneNumber</th>
                        <th>Email</th>    
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${requestScope.Customers}" var="Customer">
                        <tr>
                            <td><c:out value="${Customer.id}" /></td>
                            <td><c:out value="${Customer.firstName}" /></td>
                            <td><c:out value="${Customer.lastName}" /></td>
                            <td><c:out value="${Customer.tel}" /></td>
                            <td><c:out value="${Customer.email}" /></td> 
                        </tr>
                    </c:forEach>
                </tbody>
            </table>        
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