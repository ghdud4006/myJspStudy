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
	 	if(cookies==null){
	 		response.sendRedirect("login.jsp");
	 	}
	 	for(Cookie c : cookies) {
	 		out.print("name:"+c.getName()+"</br>");
	 		out.print("value:"+c.getValue()+"</br>");
	 		out.print("===========================</br>");
	 	}
	 %>
	</body>
</html>