package test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.board.dao.BoardDao;
import test.controller.Action;
import test.controller.ActionForward;

public class BoardDeleteAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//1. 삭제할 회원의 번호를 읽어온다.
		int num =Integer.parseInt(request.getParameter("num"));
		//2. Dao를 이용해서 DB에서 삭제한다.
		BoardDao.getInstance().delete(num);
		//3. "/member/list.do" 로 리다이렉트 이동하도록 응답한다.
		return new ActionForward("/board/list.do", true);
	}

}
