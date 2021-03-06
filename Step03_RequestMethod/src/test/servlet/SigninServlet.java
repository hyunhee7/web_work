package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/signin")
public class SigninServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청 메소드
		String method=request.getMethod();
		System.out.println("method: "+method);
		
		//post 방식 요청
		request.setCharacterEncoding("utf-8");
		
		//요청 파라미터 추출하기
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		
		System.out.println(id+"/"+pwd);
		
		//응답 인코딩 설정(한글 깨지지 않도록)
		response.setCharacterEncoding("utf-8");
		
		//응답하기
		PrintWriter pw=response.getWriter();
		pw.println(method+" 방식 /member/signin 요청 ok!");
		pw.close();
	}
}
