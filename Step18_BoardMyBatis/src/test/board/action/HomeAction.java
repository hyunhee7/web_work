package test.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class HomeAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		
		// index 페이지를 출력할 뷰 페이지로 forward 이동
		return new ActionForward("/views/home.jsp");
	}

}
