package test.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.board.dao.BoardDao;
import test.controller.Action;
import test.controller.ActionForward;


public class BoardDeleteAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//삭제할 회원의 번호 읽어오기
		int num=Integer.parseInt(request.getParameter("num"));
		//삭제하기
		BoardDao.getInstance().delete(num);
		//회원 목록 보기로 리다일렉트 이동
		ActionForward af=new ActionForward("/board/list.do",true);	
		return af;
	}

}
