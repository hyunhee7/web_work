package test.users.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.users.dao.UsersDao;
import test.users.dto.UsersDto;

public class SigninAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//로그인 성공후 이동할 url 주소
		String url=request.getParameter("url");
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		UsersDto dto=new UsersDto();
		dto.setId(id);
		dto.setPwd(pwd);
		//1. 아이디 비밀번호가 유효한 정보 인지 확인
		boolean isValid=UsersDao.getInstance().isValid(dto);
		if(isValid){//유효한 경우 
			//로그인 처리를 해준다. 
			request.getSession().setAttribute("id", id);
			request.setAttribute("msg", id+" 님 로그인 되었습니다.");
			request.setAttribute("url", url);
		}else{//유효하지 않은 경우 
			request.setAttribute("msg", "아이디 혹은 비밀번호가 틀려요");
			String location=request.getContextPath()+
					"/users/signin_form.do?url="+url;
			request.setAttribute("url", location);
		}
		//알림 페이지로 forward 이동
		return new ActionForward("/views/users/alert.jsp");
	}
	
}










