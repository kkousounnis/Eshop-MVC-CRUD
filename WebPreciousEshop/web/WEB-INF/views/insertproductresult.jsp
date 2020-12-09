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
    </head>
    <body>
        <h1>Result Insert Product</h1>
        <%
            if (isError)
                out.println("<div class=\"error\">");
            else
                out.println("<div class=\"success\"");
        %>

        <div class="<%= errMsg%>">
            <p><h4> <%= errMsg%> Error code: <%= request.getAttribute("errorCode")%>  </h4></p>
        <p><h4> <%= errMsg%> Error code: <%= request.getAttribute("errorMessage")%>  </h4></p>
    <p><h4> <%= errMsg%> On product...: <%= request.getAttribute("product")%>  </h4></p>

</div>

<div class="redirect">
    <!-- > -->

</div>
</body>
</html>
