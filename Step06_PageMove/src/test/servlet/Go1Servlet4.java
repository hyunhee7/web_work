package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test/go4")
public class Go1Servlet4 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			
		System.out.println("/go4 요청을 처리중입니다.");		
		
		//절대경로 리다이렉트 이동응답
		response.sendRedirect("result4.jsp");
	}
}
