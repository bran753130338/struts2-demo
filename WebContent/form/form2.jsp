<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>接收参数</title>
<style type="text/css">
.a {
	width: 300px;
	height: 30px;
}

#b {
	width: 500px;
	text-align: right;
}

#b button {
	width: 60px;
	margin-right: 120px;
}
</style>
</head>
<body>
	<div id="b">
		<form action="${pageContext.request.contextPath }/Paramter2Action">
			<strong>用户名：</strong><input type="text" class="a" name="user.name" /><br>
			<br> <strong>年龄：</strong><input type="text" class="a"
				name="user.age" /><br> <br> <strong>生日：</strong><input
				type="date" class="a" name="user.birthday" /><br>
				
			<button type="submit">提交</button>
		</form>
	</div>
</body>
</html>