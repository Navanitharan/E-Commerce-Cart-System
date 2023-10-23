<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Registration</title>
</head>
<body>
	<h1>Product Registration</h1>
	<form action="save" method="post">
		Product_Name:<input type="text" name="pname"><br>
		Quantity:<input type="number" name="quantity"><br>
		Price:<input type="number" name="price"><br>
		<input type="submit" value="Add Product"><br>
		<input type="reset" value="clear">
	</form>
	<a href="ViewAllProducts">View All Products</a>
</body>
</html>