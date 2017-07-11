package test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.dto.MemberDto;

/*
 *  Action 클래스 정의하는 방법
 *  
 *  1. Action 추상 클래스를 상속 받는다.
 *  2. execute 메소드를 오버라이딩한다.
 *  3. execute 메소드 안에서 비즈니스 로직을 처리한다.
 *  4. 비즈니스 로직 처리 후 이동할 경로와 리다일렉트 이동할지 여부를 ActionForward 객체에 담아서 리턴해준다.
 */
public class InfoAction extends Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//비지니스 로직 수행 후 얻어낸 모델
		MemberDto dto = new MemberDto(2,"해골","행신동");
		//모델을 request 에 담는다.
		request.setAttribute("dto", dto);
		//forward 이동할 수 있는 ActionForward객체 생성
		ActionForward af=new ActionForward("/views/info.jsp");
		//ActionForward 객체 리턴해주기
		return af;
	}

}
