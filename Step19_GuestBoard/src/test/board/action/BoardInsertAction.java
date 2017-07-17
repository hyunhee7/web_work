package test.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.board.dao.BoardDao;
import test.board.dto.BoardDto;
import test.controller.Action;
import test.controller.ActionForward;
/*
 *  폼전송되는 새글 정보를 DB 에 저장하는 액션 
 */
public class BoardInsertAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//1. 폼 전송되는 내용을 추출해서 Dto 에 담은 다음
		String writer=request.getParameter("writer");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		BoardDto dto=new BoardDto();
		dto.setWriter(writer);
		dto.setTitle(title);
		dto.setContent(content);
		//2. Dao 를 이용해서 DB 에 저장
		BoardDao.getInstance().insert(dto);
		//3. 목록 보기로 리다일렉트 이동
		return new ActionForward("/board/list.do", true);
	}
	
}










