package test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.member.dao.MemberDao;


/*
 * num 이라는 파라미터 명으로 전달되는 회원번호를 이용해서
 * 해당 회원을 DB에서 삭제한 다음 응답하는 액션
 */
public class MemberDeleteAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//1. 삭제할 회원의 번호를 읽어온다.
		int num =Integer.parseInt(request.getParameter("num"));
		//2. Dao를 이용해서 DB에서 삭제한다.
		MemberDao.getInstance().delete(num);
		//3. "/member/list.do" 로 리다이렉트 이동하도록 응답한다.
		return new ActionForward("/member/list.do", true);
	}

}