package test.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.board.dao.BoardDao;
import test.board.dto.BoardDto;
import test.controller.Action;
import test.controller.ActionForward;


public class BoardDetailAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//1. 파라미터로 전달되는 수정할 회원의 번호를 얻어온다.
		int num = Integer.parseInt(request.getParameter("num"));
		//2. Dao를 이용해서 수정할 회원의 정보를 읽어온다.
		BoardDto dto=BoardDao.getInstance().getData(num);
		//3. 수정할 회원의 정보를 request 에 담고
		request.setAttribute("dto", dto);
		//4. 뷰페이지로 forward 이동
		return new ActionForward("/views/board/detail.jsp");
	}

}
