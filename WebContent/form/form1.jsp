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
		<form action="${pageContext.request.contextPath }/ParamterAction">
			<strong>用户名：</strong><input type="text" class="a" name="name" /><br>
			<br> <strong>密 码：</strong><input type="password" class="a"
				name="password" /><br>
			<br>
			<button type="submit">提交</button>
		</form>
	</div>
</body>
</html>