<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Thông tin chi tiết</title>
</head>
<body>
		<div align="center" class="id">Mã nhân viên:${nhanvien.id}</div>
		<div align="center" class="id">Họ và tên:${nhanvien.name}</div>
		<div align="center" class="id">Ngày tháng năm sinh: ${nhanvien.birth}</div>
		<div align="center" class="id">Nghề nghiệp: ${nhanvien.job}</div>
		
		
		
		
	
</body>
</html>