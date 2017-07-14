package test.users.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import test.controller.Action;
import test.controller.ActionForward;
import test.users.dao.UsersDao;
import test.users.dto.UsersDto;

public class UsersSigninAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		UsersDto dto=new UsersDto();
		dto.setId(id);
		dto.setPwd(pwd);
		boolean isValid=UsersDao.getInstance().isValid(dto);
		if(isValid){
			request.getSession().setAttribute("id", dto.getId());
			request.setAttribute("msg", "로그인 성공!");
			return new ActionForward("/views/board/alert.jsp");
		}else{
			request.setAttribute("msg", "로그인에 실패하셨습니다.");
			return new ActionForward("/views/board/alert.jsp");
		}
		
	}

}
