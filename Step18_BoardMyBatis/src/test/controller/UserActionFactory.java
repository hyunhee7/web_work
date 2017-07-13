package test.controller;

import test.action.BoardDeleteAction;
import test.action.BoardDetailAction;
import test.action.BoardInsertAction;
import test.action.BoardInsertformAction;
import test.action.BoardListAction;
import test.action.BoardUpdateAction;
import test.action.HomeAction;

public class UserActionFactory {
	private static UserActionFactory factory;
	private UserActionFactory(){}
	//자신의 참조값을 리턴해주는 메소드
	public static UserActionFactory getInstance(){
		if(factory==null){
			factory=new UserActionFactory();
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
		}
		return action;
	}
}







