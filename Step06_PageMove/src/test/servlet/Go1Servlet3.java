package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/go3")
public class Go1Servlet3 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			
		System.out.println("/go3 요청을 처리중입니다.");
		response.sendRedirect("test/result3.jsp");
			
		//절대 경로 리다이렉트 이동응답
		//response.sendRedirect("/Step06_PageMove]j/test/result3.jsp");
		
		//Context Path를 request객체로 부터 얻어오기
		//String cPath = request.getContextPath();
		//System.out.println("cPath:"+cPath);
		
		//절대경로 리다이렉트 이동응답
		//response.sendRedirect(cPath+"/test/result3.jsp");
	}
}
