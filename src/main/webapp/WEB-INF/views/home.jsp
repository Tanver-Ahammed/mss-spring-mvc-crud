<%--
  Created by IntelliJ IDEA.
  User: tanver
  Date: 2/26/22
  Time: 8:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <%@include file="./base.jsp" %>
    <title>Home Page</title>
</head>
<body>

<div class="container mt-3">
    <div class="row">
        <div class="col-md-row">
            <h1 class="text-center md-3">Welcome to Product App</h1>


            <table class="table table-hover">
                <thead class="table-dark">
                <tr>
                    <th scope="col">Product Id</th>
                    <th scope="col">Product Name</th>
                    <th scope="col">Product Description</th>
                    <th scope="col">Product Price</th>
                    <th scope="col">Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${products }" var="p">
                    <tr>
                        <th scope="row">TECHONLY${p.id }</th>
                        <td>${p.name }</td>
                        <td>${p.description }</td>
                        <td><b>&#2547; ${p.price }</b></td>
                        <td><a href="delete/${p.id }"><i
                                class="fas fa-trash text-danger" style="font-size: 25px"></i></a>
                            <a href="update/${p.id }"><i
                                    class="fas fa-pen text-primary" style="font-size: 25px"></i></a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

            <div class="container text-center">
                <a href="add-product" class="btn btn-outline-success">Add
                    Product</a>
            </div>

        </div>
    </div>
</div>

</body>
</html>
