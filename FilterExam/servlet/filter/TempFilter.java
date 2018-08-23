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
		// 보통 자원 반납
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(" -- filter doFilter -- ");
		//eg. 인코딩, 세션 데이터 인증, 팝업창 뛰움
		response.setContentType("text/html; charset=UTF-8"); 
		// request filter code
		request.setCharacterEncoding("UTF-8");
		
		chain.doFilter(request, response); //연결 끊어진 것을 위의 코드 수행후 다시 붙이는 체인 (연결 사이에 있기 때문에)
		// chain의 다음 필터 처리
		
		// response filter code
		response.setContentType("text/html; charset=UTF-8"); 
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println(" -- filter init -- ");
		// 필터 초기화 작업
	}

	
}
