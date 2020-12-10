<%-- 
    Document   : errorinsertproduct
    Created on : Dec 9, 2020, 1:19:17 PM
    Author     : konstantinos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    boolean isError;
    String errMsg;
%>


<%
    isError = (boolean) request.getAttribute("isError");
    if (isError)
        errMsg = "error";
    else
        errMsg = "success";
%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result of Insert Product - <%=request.getContextPath()%></title>
        <!--        <link rel='stylesheet' type='text/css' href='static/css/styles.css'>-->
        <!--<link rel='stylesheet' type='text/css' href='static/css/styles.css'>-->
        <link rel='stylesheet' type='text/css' href='static/css/bootstrap.min.css'>
    </head>
    <body>
        <%@ include file="../../static/mymenu.jsp" %>
        <div class="container">
            <jsp:useBean id="product" class="models.Product" scope="session"/>
             <%=product.getName()%>
            <div class="row">
                <div class="col-md-12">
                    <h1>Result Insert Product</h1>
                    <%
                        if (isError)
                            out.println("<div class=\"error\">");
                        else
                            out.println("<div class=\"success\"");
                    %>

                    <div class="<%= errMsg%>">
                        <p><h4> <%= errMsg.toUpperCase()%> Error code: <%= request.getAttribute("errorCode")%>  </h4></p>
                        <p><h4> <%= errMsg.toUpperCase()%> Error code: <%= request.getAttribute("errorMessage")%>  </h4></p>
                        <p><h4> <%= errMsg%> On product...: <%= request.getAttribute("product")%>  </h4></p>
                    </div>
                </div><!-- comment -->
            </div>
        </div>


    </body>
    
    <footer class="page-footer font-small blue pt-4" >
        <div class="container">
            <div class="redirect">            
                <a href="<%= request.getContextPath()%>">Visit Home Page</a>
            </div>
        </div>
    </footer>
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
