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
		
		if(session.getAttribute("sid")==null){
			response.sendRedirect("login.jsp");
		} else {
			out.print("sid:"+session.getAttribute("sid"));
		%>
			<form action="/SessionPrac/logoutCon" method="get">
				<input type="submit" value="logout">
			</form>
		<%
		}
		%>
	</body>
</html>