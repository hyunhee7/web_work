package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *  [ 서블릿 클래스 만드는 방법 ]
 *  
 *  1. HttpServlet 클래스를 상속 받는다.
 *  2. service() 메소드를 오버라이딩한다.
 *  3. Annotation으로 맵핑한다.
 */
@WebServlet("/showtime")
public class ShowTimeServlet extends HttpServlet{//1.
	//2.
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답 인코딩 설정
		response.setCharacterEncoding("utf-8");
		//응답 컨텐츠 설정
		response.setContentType("text/html;charset=utf-8");
		//클라이언트에게 출력할 수 있는 객체의 참조값을 얻어온다.
		PrintWriter pw = response.getWriter();
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'/>");
		pw.println("<title>시간페이지</title");
		pw.println("</head>");
		pw.println("<body>");
		Date d = new Date();
		pw.println("<h3>현재시간:"+ d.toString() +"</h3>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
}
