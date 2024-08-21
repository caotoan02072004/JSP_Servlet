<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Customer</title>
<link rel="stylesheet" type="text/css"  href="resources/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1 class="my-5">Update Customer</h1>
		<form action="UpdateCustomer" method="post">
		<input type="hidden" name = "id" value="${c.id}">
			<div class="form-group">
				<label>Name</label>
				<input type="text" name="name" class="form-control" placeholder="Nhập tên khách hàng..." value="${c.name}">
			</div>
			<label>Gender</label>
			<div class="form-group">
				<div class="form-check form-check-inline">
					<label>
						<input class="form-check-input" type="radio" name="gender" value="0" ${c.gender == false ? "checked" : ""}>Nam
					</label>
				</div>
				<div class="form-check form-check-inline">
					<label>
						<input class="form-check-input" type="radio" name="gender" value="1" ${c.gender == true ? "checked" : ""}>Nữ
					</label>
				</div>
			</div>
			<div class="form-group">
				<label>Birthday</label>
				<input type="date" name="birthday" class="form-control" placeholder="Nhập sinh nhật của khách hàng..." value="${c.birthday}">
			</div>
			<div class="form-group">
				<label>Address</label>
				<input type="text" name="address" class="form-control" placeholder="Nhập địa chỉ khách hàng..." value="${c.address}">
			</div>
			<div class="form-group">
				<label>Phone</label>
				<input type="text" name="phone" class="form-control" placeholder="Nhập số điện thoại khách hàng..." value="${c.phone}">
			</div>
			<div class="form-group">
				<label>Email</label>
				<input type="text" name="email" class="form-control" placeholder="Nhập email khách hàng..." value="${c.email}">
			</div>
			<button class="btn btn-primary mt-3" type="submit">Cập nhật</button>
		</form>
	</div>
</body>
</html>