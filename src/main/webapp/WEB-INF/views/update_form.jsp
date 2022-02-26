<%--
  Created by IntelliJ IDEA.
  User: tanver
  Date: 2/26/22
  Time: 8:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <%@include file="./base.jsp" %>
</head>
<body>


<div class="continer mt-3">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <h1 class="text-align-center mb-3">Change The Product Details</h1>
            <form action="${pageContext.request.contextPath }/handle-product"
                  method="post">

                <div class="form-group">
                    <label for="id"><b>Product Id</b></label> <input type="text"
                                                                     class="form-control" id="id" name="id"
                                                                     placeholder="Enter Your Product"
                                                                     value="${product.id }">
                </div>

                <div class="form-group">
                    <label for="name"><b>Product Name</b></label> <input type="text"
                                                                         class="form-control" id="name" name="name"
                                                                         placeholder="Enter Your Product"
                                                                         value="${product.name }">
                </div>

                <div class="form-group">
                    <label for="description"><b>Product Description</b></label>
                    <textarea class="form-control" id="description" name="description"
                              rows="5" placeholder="Enter Your Product Description">${product.description }</textarea>
                </div>

                <div class="form-group">
                    <label for="price"><b>Product Description</b></label> <input
                        type="text" class="form-control" id="price" name="price"
                        placeholder="Enter Your Product Price" value="${product.price }">
                </div>

                <div class="container text-center mt-3">
                    <a href="${pageContext.request.contextPath}/"
                       class="btn btn-outline-danger">Back</a>
                    <button type="submit" class="btn btn-outline-success">Update
                        Product
                    </button>
                </div>

            </form>

        </div>
    </div>
</div>


</body>
</html>
