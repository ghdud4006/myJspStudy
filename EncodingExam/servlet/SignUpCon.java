package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signUpCon")
public class SignUpCon extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		response.setContentType("text/html; charset=UTF-8"); 
		
		PrintWriter out = response.getWriter();
		
		String mUserName = request.getParameter("mUserName");
		String mUserNickname = request.getParameter("mUserNickname");
		
		out.println("<p>"+mUserName+","+mUserNickname+"</p>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("UTF-8");
		
		response.setContentType("text/html; charset=UTF-8"); 
		
		PrintWriter out = response.getWriter();
		
		String mUserName = request.getParameter("mUserName");
		String mUserNickname = request.getParameter("mUserNickname");
		
		out.println("<p>"+mUserName+","+mUserNickname+"</p>");
	}

}
