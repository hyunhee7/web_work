package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/signin3")
public class SigninServlet3 extends HttpServlet{
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
		
		//로그인 성공 여부
		boolean isSuccess=false;
		
		if(id.equals("gura") && pwd.equals("1234")){
			//로그인 정보가 맞으면 여기가 실행된다고 가정하자
			isSuccess=true;
		}
		
		//응답 인코딩 설정(한글 깨지지 않도록)
		response.setCharacterEncoding("utf-8");
		//응답 컨텐츠 설정 : utf-8문자열을 응답할거야 라고 알려주고  응답한다
		response.setContentType("text/html;charset=utf-8");
		
		//응답하기
		PrintWriter pw=response.getWriter();
		
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'/>");
		pw.println("<title>로그인 요청결과</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<p> method : " + method + " 방식 요청 ok! </p>");
		//로그인 성공 여부에 따라 다른 컨텐츠 응답하기
		if(isSuccess){
			pw.println("<script>");
			pw.println("alert('로그인 되었습니다');");
			pw.println("</script>");
		}else{
			pw.println("<script>");
			pw.println("alert('아이디 혹은 비밀번호가 틀려요!');");
			pw.println("</script>");
		}
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
}
