package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/go8")
public class Go1Servlet8 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			
		System.out.println("/go8 요청을 처리중입니다.");		
		
		//요청 전달자 객체의 참조값 얻어오기
		RequestDispatcher rd =
				request.getRequestDispatcher("view1.jsp");
		//view1.jsp 페이지에 응답을 위임한다.
		rd.forward(request, response);
	}
}
