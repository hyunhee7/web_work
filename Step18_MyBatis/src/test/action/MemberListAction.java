package test.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MemberListAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//1. DB 에서 회원 목록을 얻어온다.
		List<MemberDto> list = MemberDao.getInstance().getList();
		//2. request 에 담는다.
		request.setAttribute("list", list);
		//3. 뷰페이지로 forward 이동해서 목록을 출력해 준다.
		return new ActionForward("/views/member/list.jsp");
	}
	
}
