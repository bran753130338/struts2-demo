<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>测试Struts2获取ServletApi</title>
</head>
<body>
<h1>request:${requestScope.name }</h1><br>
<h1>session:${sessionScope.name }</h1><br>
<h1>application:${applicationScope.name }</h1>
</body>
</html>