<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>

<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="cssforsave.css" rel="stylesheet" >
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container register-form">
			<f:form action="update" method="post"  modelAttribute="productBean">
			
            <div class="form">
                <div class="note">
                    <p>Product Edit.</p>
                </div>

                <div class="form-content">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <f:input class="form-control" placeholder="Prodcut ID"   path="productId" />
                            </div>
                            <div class="form-group">
                                <f:input class="form-control" placeholder="Product Name" path="productName"/>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <f:input  class="form-control" placeholder="Product Price" path="productPrice"/>
                            </div>
                            
                        </div>
                    </div>
                    <button type="submit" class="btnSubmit">Update</button>
                </div>
            </div>
            </f:form>
        </div>