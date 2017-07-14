package test.controller;

import test.board.action.BoardDeleteAction;
import test.board.action.BoardDetailAction;
import test.board.action.BoardInsertAction;
import test.board.action.BoardInsertformAction;
import test.board.action.BoardListAction;
import test.board.action.BoardUpdateAction;
import test.board.action.HomeAction;
import test.users.action.UsersLogoutAction;
import test.users.action.UsersSigninAction;
import test.users.action.UsersSignupAction;
import test.users.action.UsersSignupformAction;

public class BoardActionFactory {
	private static BoardActionFactory factory;
	private BoardActionFactory(){}
	//자신의 참조값을 리턴해주는 메소드
	public static BoardActionFactory getInstance(){
		if(factory==null){
			factory=new BoardActionFactory();
		}
		return factory;
	}
	
	//인자로 전달되는 command 를 수행할 Action type 객체를 리턴해주는 
	//메소드
	public Action action(String command){
		//Action 추상클래스 type 을 담을 지역변수 만들기 
		Action action=null;
		if(command.equals("/home")){
			action=new HomeAction();
		}else if(command.equals("/board/list")){
			action=new BoardListAction();
		}else if(command.equals("/board/delete")){
			action=new BoardDeleteAction();
		}else if(command.equals("/board/insertform")){
			action=new BoardInsertformAction();
		}else if(command.equals("/board/insert")){
			action=new BoardInsertAction();
		}else if(command.equals("/board/detail")){
			action=new BoardDetailAction();
		}else if(command.equals("/board/update")){
			action=new BoardUpdateAction();
		}else if(command.equals("/users/signupform")){
			action=new UsersSignupformAction();
		}else if(command.equals("/users/signup")){
			action=new UsersSignupAction();
		}else if(command.equals("/users/signin")){
			action=new UsersSigninAction();
		}else if(command.equals("/users/logout")){
			action=new UsersLogoutAction();
		}
		return action;
	}
}








