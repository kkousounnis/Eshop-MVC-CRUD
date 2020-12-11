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
                        <td><c:out value="${Customer.customerid}" /></td>
                        <td><c:out value="${Customer.firstName}" /></td>
                        <td><c:out value="${Customer.lastName}" /></td>
                        <td><c:out value="${Customer.tel}" /></td>
                        <td><c:out value="${Customer.email}" /></td> 
                    </tr>
                </c:forEach>
            </tbody>
        </table>        

    </body>
</html>