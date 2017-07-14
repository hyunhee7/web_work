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
		//1. 폼 전송되는 수정할 회원의 정보를 얻어온다.
		int num=Integer.parseInt(request.getParameter("num"));
		String writer=request.getParameter("writer");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String regdate=request.getParameter("regdate");
		BoardDto dto=new BoardDto(num, writer, title, content, regdate);
		//2. Dao를 이용해서 DB에 수정 반영한다.
		BoardDao.getInstance().update(dto);
		//3. 응답한다.
		request.setAttribute("msg", num+" 번 회원의 정보를 수정함");
		return new ActionForward("/views/board/alert.jsp");		
	}

}
