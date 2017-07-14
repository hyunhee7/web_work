package test.users.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class UsersLogoutAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().invalidate();
		request.setAttribute("msg", "로그아웃하였습니다.");
		return new ActionForward("/views/board/alert.jsp");		
	}

}
