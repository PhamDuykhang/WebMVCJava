<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Thay đỗi</title>
</head>
<body>
	<c:if test="${kq==true}">
	<h3 id="complet">Thành công</h3>
	</c:if>
	<c:if test="${kq==false}">
	<h3 id="err">Thất bại </h3>
	</c:if>
	<div id="formd">
		<form class="col-md-6" action="<%=request.getContextPath()%>/Edit" method="POST">
			<h3>
				Chỉnh sữa thông tin <span class="label label-default"></span>
			</h3>
			<div class="form-group">
				<label for="exampleInputEmail1">ID</label> <input name="id"
					type="text" value="${nhanvien.id}" class="form-control"
					id="exampleInputName2" placeholder="1,2,3..">

			</div>
			<div class="form-group">
				<label for="exampleInputEmail2">Họ và tên</label> <input name="name"
					type="text" value="${nhanvien.name}" class="form-control"
					id="exampleInputName2" placeholder="Khang">

			</div>
			<div class="form-group">
				<label for="exampleInputEmail3">Ngày sinh</label> <input
					name="ngaysinh" type="text" value="${nhanvien.birth}"
					class="form-control" id="exampleInputName3"
					placeholder="02/01/1996">

			</div>
			<div class="form-group">
				<label for="exampleInputPassword4">Nghê nghiệp</label> <input
					name="job" type="text" value="${nhanvien.job}" class="form-control"
					id="exampleInputName4" placeholder="Ăn">
			</div>

			<button type="submit" class="btn btn-primary">Chỉnh sửa</button>
		</form>
	</div>
</body>
</html>