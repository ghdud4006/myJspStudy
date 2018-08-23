<% request.setCharacterEncoding("UTF-8"); %>
<%@page language="java" contentType="text/html;charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Title</title>
	</head>
	<body>
		<%!
		String mUserName;
		String mUserNickname;
		%>
		
		<%
		mUserName = request.getParameter("mUserName");
		mUserNickname = request.getParameter("mUserNickname");
		%>
		이름:<%=mUserName %><br>
		별명:<%=mUserNickname %>
		
	</body>
</html>