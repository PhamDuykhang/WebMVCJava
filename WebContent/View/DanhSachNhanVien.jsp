<%@page import="com.cnttctu.mywebmvc.Entity.employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Danh sách nhân viên </title>
</head>
<body>

<h2 align="center">Bảng danh sách nhân viên</h2>
<c:if test="${kq==0}">
	<h3 id="complet">Thêm thành công</h3>
	</c:if>
<c:if test="${kq==1}">
	<h3 id="complet">Thêm Thất bại</h3>
	</c:if>
	<c:if test="${kq1==0}">
	<h3 id="complet">Xóa thành công</h3>
	</c:if>
	<c:if test="${kq1==1}">
	<h3 id="complet">Không xóa được</h3>
	</c:if>
	<table align="center" id="customers">
  <tr>
    <th>ID</th>
    <th>Tên</th>
    <th>Năm sinh</th>
    <th>Công việc</th>
    <th>Action</th>
  </tr>
  <tr>
 <c:forEach items="${DS}" var="element">
 <tr>
				<td>${element.id}</td>
				<td>${element.name}</td>
				<td>${element.birth}</td>
				<td>${element.job}</td>
				<td><a href="http://localhost:8080/WebMVC/Xoa?id=${element.id}">Xóa</a> /
				<a href="http://localhost:8080/WebMVC/Edit?id=${element.id}">Sửa</a>/
				<a href="http://localhost:8080/WebMVC/nhanvien?id=${element.id}">Chi tiết</a></td></td>
				
</tr>
 </c:forEach>
    
  </tr>
</table>
<div class="col-md-3"></div>
<a class="btn btn-primary" href="<%=request.getContextPath()%>/Add" role="button">Thêm nhân viên</a>
</body>
</html>