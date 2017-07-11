package test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

/*
 *  Action 클래스 정의하는 방법
 *  
 *  1. Action 추상 클래스를 상속 받는다.
 *  2. execute 메소드를 오버라이딩한다.
 *  3. execute 메소드 안에서 비즈니스 로직을 처리한다.
 *  4. 비즈니스 로직 처리 후 이동할 경로와 리다일렉트 이동할지 여부를 ActionForward 객체에 담아서 리턴해준다.
 */
public class FortuneAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//오늘의 운세를 얻어노는 비즈니스 로직 수행
		String fortuneToday="동쪽으로 가면 귀인을 만나요!";
		//Model 을 request 에 담는다.
		request.setAttribute("fortuneToday", fortuneToday);
		//ActionForward 객체를 생성한다.
		ActionForward af=new ActionForward("/views/fortune.jsp");
		//ActionForward 객체 리턴해주기
		return af;
	}
	
}
