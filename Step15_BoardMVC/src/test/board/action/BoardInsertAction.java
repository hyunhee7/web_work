package test.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.board.dao.BoardDao;
import test.board.dto.BoardDto;
import test.controller.Action;
import test.controller.ActionForward;

public class BoardInsertAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		
		String writer=request.getParameter("writer");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		
		BoardDto dto=new BoardDto();
		dto.setWriter(writer);
		dto.setTitle(title);
		dto.setContent(content);
		BoardDao.getInstance().insert(dto);
		return new ActionForward("/board/list.do", true);
	}

}
