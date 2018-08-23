package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginCon")
public class LoginCon extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String mUserId = request.getParameter("mUserId");
		String mUserPwd = request.getParameter("mUserPwd");
		
		out.println(mUserId+"</br>");
		out.println(mUserPwd);
		
		Cookie[] cookies = request.getCookies();
		Cookie cookie = null;
		
		for(Cookie c : cookies) {
			System.out.println("name:"+c.getName()+"/value:"+c.getValue());
			if(c.getName().equals("memberId")) {
				cookie = c;
			}
		}
		
		if(cookie==null) {
			System.out.println("req cookie is null");
			cookie = new Cookie("memberId", mUserId); //name-value
		}
		
		response.addCookie(cookie);
		cookie.setMaxAge(60*60); //쿠키 만료 유효시간()
		
		response.sendRedirect("loginOk.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
