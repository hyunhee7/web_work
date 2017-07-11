package test.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.board.dao.BoardDao;
import test.board.dto.BoardDto;
import test.controller.Action;
import test.controller.ActionForward;

public class BoardUpdateAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//폼 전송되는 파라미터 추출
		int num=Integer.parseInt(request.getParameter("num"));
		String writer=request.getParameter("writer");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String regdate=request.getParameter("regdate");
		//DB에 수정 반영
		BoardDto dto=new BoardDto(num, writer, title, content, regdate);
		BoardDao.getInstance().update(dto);
		//회원목록보기 redirect
		return new ActionForward("/board/list.do", true);
	}

}
