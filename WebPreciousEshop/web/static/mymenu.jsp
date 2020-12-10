<%-- 
    Document   : mymenu
    Created on : Dec 10, 2020, 1:19:25 AM
    Author     : konstantinos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container">
    <div class="row">
        <div class="col-md-12">
            <nav class="navbar navbar-expand-lg navbar-blue bg-light">
                
                <ul class="navbar-nav">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="dropdown">
                                <button class="btn dropdown-toggle " type="button" data-toggle="dropdown">Customers
                                    <span class="caret"></span></button>
                                <ul class="dropdown-menu">
                                    <li><a class="dropdown-item" href="customer">New</a></li>
                                    <li><a class="dropdown-item" href="#">Update</a></li>
                                    <li><a class="dropdown-item" href="#">Delete</a></li>
                                    <li><a class="dropdown-item" href="#">View all</a></li>  
                                </ul>
                            </div>
                        </div>
                    </div> 
                    <div class="row">
                        <div class="col-md-6">
                            <div class="dropdown">
                                <button class="btn dropdown-toggle" type="button" data-toggle="dropdown">Products
                                    <span class="caret"></span></button>
                                <ul class="dropdown-menu">
                                    <li><a class="dropdown-item" href="product">New</a></li>
                                    <li><a class="dropdown-item" href="#">Update</a></li>
                                    <li><a class="dropdown-item" href="#">Delete</a></li>
                                    <li><a class="dropdown-item" href="#">View all</a></li>                            
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="dropdown">
                                <button class="btn dropdown-toggle" type="button" data-toggle="dropdown">Orders
                                    <span class="caret"></span></button>
                                <ul class="dropdown-menu">
                                    <li><a class="dropdown-item" href="#">New</a></li>
                                    <li><a class="dropdown-item" href="#">Update</a></li>
                                    <li><a class="dropdown-item" href="#">Delete</a></li>
                                    <li><a class="dropdown-item" href="#">View all</a></li>  
                                </ul>
                            </div>  
                        </div>
                    </div>
                </ul>                
            </nav>
        </div>
    </div>
</div>
