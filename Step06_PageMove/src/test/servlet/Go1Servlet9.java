package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test/go9")
public class Go1Servlet9 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			
		System.out.println("/test/go9 요청을 처리중입니다.");
		
		//forward 이동을 하면서 전달할 데이터가 있으면 request에 담는다.
		request.setAttribute("myName", "김구라");
		
		//요청 전달자 객체의 참조값 얻어오기
		RequestDispatcher rd =
				request.getRequestDispatcher("view2.jsp");
		//view1.jsp 페이지에 응답을 위임한다.
		rd.forward(request, response);
	}
}

