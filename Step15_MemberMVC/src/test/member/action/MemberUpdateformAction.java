package test.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MemberUpdateformAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//수정할 회원의 번호를 읽어온다.
		int num=Integer.parseInt(request.getParameter("num"));
		//수정할 회원의 정보를 DB에서 얻어온다.
		MemberDto dto=MemberDao.getInstance().getData(num);
		//request 에 회원정보를 담는다.
		request.setAttribute("dto", dto);
		//회원정보 수정폼 페이지로 forward 이동할 수 있도록
		return new ActionForward("/views/member/updateform.jsp");
	}

}
