package test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dto.MemberDto;

@WebServlet("/mycon")
public class MyController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라이언트의 요청 분석
		String command=request.getParameter("command");
		//이동경로
		String path="";
		//리다일렉트 이동 여부
		boolean isRedirect=false;
		
		if(command.equals("fortune")){
			//오늘의 운세를 얻어오는 비즈니스 로직 수행
			String fortuneToday="동쪽으로 가면 귀인을 만나요~";		
			//request 객체에 담는다.
			request.setAttribute("fortuneToday", fortuneToday);
			//뷰페이지로 forward 이동 (응답을 jsp 페이지에 위임하기)
			path="/views/fortune.jsp";
		}else if(command.equals("info")){
			//회원 정보를 얻어오는 비즈니스 로직 수행
			MemberDto dto=new MemberDto(1,"김구라","노량진");
			// "/views/info.jsp" 페이지로 forward 이동해서
			// 회원정보를 응답해 보세요.
			request.setAttribute("dto", dto);
			path="/views/info.jsp";
		}else if(command.equals("signin")){
			//폼전송 파라미터로 전달되는 아이디를 읽어온다.
			String id=request.getParameter("id");
			//세션에 담는다.
			request.getSession().setAttribute("id", id); //session 얻어오려면 request.을이용해야함
			path=request.getContextPath()+"/index.jsp"; 
			isRedirect=true;
		}else if(command.equals("signout")){
			request.getSession().invalidate();
			path=request.getContextPath()+"/index.jsp";
			isRedirect=true;
		}
		
		
		if(isRedirect){ //리다일렉트 이동해야 한다면
			//redirect 이동
			response.sendRedirect(path);
		}else{
			//forward 이동
			RequestDispatcher rd=request.getRequestDispatcher(path);
			rd.forward(request, response);
		}
		

	}
}
