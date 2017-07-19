package test.controller;

import test.action.HomeAction;
import test.file.action.FileDeleteAction;
import test.file.action.FileInsertAction;
import test.file.action.FileInsertformAction;
import test.file.action.FileListAction;

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
		}else if(command.equals("/file/list")){
			action=new FileListAction();
		}else if(command.equals("/file/insertform")){
			action=new FileInsertformAction();
		}else if(command.equals("/file/insert")){
			action=new FileInsertAction();
		}else if(command.equals("/file/delete")){
			action=new FileDeleteAction();
		}
		return action;
	}
}








