package test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

/*
 *  Action 클래스 정의하는 방법
 *  
 *  1. Action 추상 클래스를 상속 받는다.
 *  2. execute 메소드를 오버라이딩한다.
 *  3. execute 메소드 안에서 비즈니스 로직을 처리한다.
 *  4. 비즈니스 로직 처리 후 이동할 경로와 리다일렉트 이동할지 여부를 ActionForward 객체에 담아서 리턴해준다.
 */
public class SigninAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		String id=request.getParameter("id");
		request.getSession().setAttribute("id", id);
		ActionForward af=new ActionForward("/index.jsp",true);
		return af;
	}

}
