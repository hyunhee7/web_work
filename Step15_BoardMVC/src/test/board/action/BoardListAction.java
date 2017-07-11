package test.board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.board.dao.BoardDao;
import test.board.dto.BoardDto;
import test.controller.Action;
import test.controller.ActionForward;

public class BoardListAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		
		List<BoardDto> list=BoardDao.getInstance().getList();
		request.setAttribute("list", list);
		ActionForward af=new ActionForward("/board/list.jsp");
		return af;
	}

}
