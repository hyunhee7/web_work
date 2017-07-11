package test.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class ActionServlet extends HttpServlet{
	
	public static final int INCLUDE_EXTENSION_LENGTH=3;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		String contextName=request.getContextPath();
		String command=uri.substring(contextName.length(),uri.length()-INCLUDE_EXTENSION_LENGTH);

		Action action=BoardActionFactory.getInstance().action(command);

		if(action != null){//처리 가능한 command 라면 
			ActionForward af=null;
			try{
				af=action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
				return;
			}
			if(af.isRedirect()){//redirect 이동해야 한다면
				//redirect 이동 시킨다.
				response.sendRedirect(contextName+af.getPath());
			}else{//forward 이동해야 한다면 
				RequestDispatcher rd=
						request.getRequestDispatcher(af.getPath());
				rd.forward(request, response);
			}
		}	
	}
}
