<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Customer</title>
<link rel="stylesheet" type="text/css"  href="resources/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1 class="mt-5">Danh sách khách hàng</h1>
		<a class="btn btn-primary my-3" href="add.jsp">Thêm mới +</a>
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
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items = "${listC }" var="c">
					<tr>
						<td>${c.id}</td>
						<td>${c.name}</td>
						<td>${c.gender == "0" ? "Nam" : "Nữ"}</td>
						<td>${c.birthday}</td>
						<td>${c.address}</td>
						<td>${c.phone}</td>
						<td>${c.email}</td>
						<td>
							<a href="UpdateCustomer?cid=${c.id}" class="btn btn-success">Sửa</a>
							<a href="DetailCustomer?cid1=${c.id}" class="btn btn-info">Chi tiết</a>
							<a onclick="return confirm('Are you sure???')" href="DeleteCustomer?cid=${c.id}" class="btn btn-dark">Xóa</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>