<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail Customer</title>
<link rel="stylesheet" type="text/css"  href="resources/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1 class="mt-5">Chi tiết khách hàng</h1>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Gender</th>
					<th>Birthday</th>
					<th>Address</th>
					<th>Phone</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${c.id}</td>
					<td>${c.name}</td>
					<td>${c.gender == "0" ? "Nam" : "Nữ"}</td>
					<td>${c.birthday}</td>
					<td>${c.address}</td>
					<td>${c.phone}</td>
					<td>${c.email}</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>