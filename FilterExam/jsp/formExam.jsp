<%@page language="java" contentType="text/html;charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Title</title>
	</head>
	<body>
		<h1><p>POST to Servlet</p><br></h1>
		<form action="/FilterExam/signUpCon" method="post">
			이름:<input type="text" name="mUserName"><br>
			별명:<input type="text" name="mUserNickname"><br>
			<input type="submit" value="join">
		</form>	
		<br><br>
		
		<h1><p>GET to Servlet</p><br></h1>
		<form action="/FilterExam/signUpCon" method="get">
			이름:<input type="text" name="mUserName"><br>
			별명:<input type="text" name="mUserNickname"><br>
			<input type="submit" value="join">
		</form>	
		<br><br>
		
		<h1><p>GET to JSP</p><br></h1>
		<form action="signUpCon.jsp" method="get">
			이름:<input type="text" name="mUserName"><br>
			별명:<input type="text" name="mUserNickname"><br>
			<input type="submit" value="join">
		</form>
	
	</body>
</html>