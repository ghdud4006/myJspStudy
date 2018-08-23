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
			Cookie[] cookies = request.getCookies();
			System.out.println("Cookies:"+cookies);
			if(cookies!=null){
				for(Cookie c: cookies){
					if(c.getName().equals("memberId")){
						response.sendRedirect("loginOk.jsp");
					}
				}
			}
		%>
	
		<form action="/CookieExam/loginCon" method="post">
			ID : <input type="text" name="mUserId"></br>
			PWD : <input type="password" name="mUserPwd"></br>
			<input type="submit" value="login">
		</form>
	
	</body>
</html>