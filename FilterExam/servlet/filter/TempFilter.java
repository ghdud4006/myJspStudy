package com.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TempFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println(" -- filter destroy -- ");
		// ���� �ڿ� �ݳ�
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(" -- filter doFilter -- ");
		//eg. ���ڵ�, ���� ������ ����, �˾�â �ٿ�
		response.setContentType("text/html; charset=UTF-8"); 
		// request filter code
		request.setCharacterEncoding("UTF-8");
		
		chain.doFilter(request, response); //���� ������ ���� ���� �ڵ� ������ �ٽ� ���̴� ü�� (���� ���̿� �ֱ� ������)
		// chain�� ���� ���� ó��
		
		// response filter code
		response.setContentType("text/html; charset=UTF-8"); 
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println(" -- filter init -- ");
		// ���� �ʱ�ȭ �۾�
	}

	
}
