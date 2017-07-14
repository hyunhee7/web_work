package test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.board.dao.BoardDao;
import test.board.dto.BoardDto;
import test.controller.Action;
import test.controller.ActionForward;


public class BoardInsertAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//1. 파라미터로 전달되는 회원정보를 읽어와서
		String writer=request.getParameter("writer");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		BoardDto dto=new BoardDto();
		dto.setWriter(writer);
		dto.setTitle(title);
		dto.setContent(content);
		//2. DB에 저장하고
		BoardDao.getInstance().insert(dto);
		//3. 응답한다.
		request.setAttribute("msg", "회원정보를 저장했습니다.");
		
		return new ActionForward("/views/board/alert.jsp");		
	}

}
