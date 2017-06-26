package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/go1")
public class Go1Servlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			
			//응답 인코딩 설정
			response.setCharacterEncoding("utf-8");
			//응답 컨텐츠 type설정
			response.setContentType("text/html;charset=utf-8");
			//응답할 객체
			PrintWriter pw = response.getWriter();
			pw.println("현재주소창을 확인하세요.");
			pw.close();
			
	}
}
