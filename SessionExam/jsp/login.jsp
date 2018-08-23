<%@page language="java" contentType="text/html;charset=EUC-KR"
pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Title</title>
	</head>
	<body>
		<%
		session = request.getSession();
		if(session.getAttribute("sid")!=null){
			response.sendRedirect("loginOk.jsp");
		}
		%>
		<form action="/SessionPrac/loginCon" method="post">
			ID:<input type="text" name="mUserID"><br>
			PWD:<input type="password" name="mUserPwd"><br>
			<input type="submit" value="login">
		</form>
	</body>
</html>