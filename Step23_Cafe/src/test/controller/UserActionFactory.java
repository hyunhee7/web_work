package test.controller;

import test.action.HomeAction;
import test.cafe.action.CafeCommentInsertAction;
import test.cafe.action.CafeDeleteAction;
import test.cafe.action.CafeDetailAction;
import test.cafe.action.CafeInsertAction;
import test.cafe.action.CafeInsertformAction;
import test.cafe.action.CafeListAction;
import test.cafe.action.CafeUpdateAction;
import test.cafe.action.CafeUpdateformAction;
import test.users.action.CheckIdAction;
import test.users.action.SigninAction;
import test.users.action.SigninFormAction;
import test.users.action.SignoutAction;
import test.users.action.SignupAction;
import test.users.action.SignupFormAction;
import test.users.action.UsersDeleteAction;
import test.users.action.UsersInfoAction;
import test.users.action.UsersUpdateAction;
import test.users.action.UsersUpdateformAction;

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
		}else if(command.equals("/users/signup_form")){
			action=new SignupFormAction();
		}else if(command.equals("/users/checkid")){
			action=new CheckIdAction();
		}else if(command.equals("/users/signup")){
			action=new SignupAction();
		}else if(command.equals("/users/signin_form")){	
			action=new SigninFormAction();
		}else if(command.equals("/users/signin")){
			action=new SigninAction();
		}else if(command.equals("/users/signout")){
			action=new SignoutAction();
		}else if(command.equals("/users/private/info")){
			action=new UsersInfoAction();
		}else if(command.equals("/users/private/delete")){
			action=new UsersDeleteAction();
		}else if(command.equals("/users/private/updateform")){
			action=new UsersUpdateformAction();
		}else if(command.equals("/users/private/update")){
			action=new UsersUpdateAction();
		}else if(command.equals("/cafe/list")){
			action=new CafeListAction();
		}else if(command.equals("/cafe/private/insertform")){
			action=new CafeInsertformAction();
		}else if(command.equals("/cafe/private/insert")){
			action=new CafeInsertAction();
		}else if(command.equals("/cafe/detail")){
			action=new CafeDetailAction();
		}else if(command.equals("/cafe/private/delete")){
			action=new CafeDeleteAction();
		}else if(command.equals("/cafe/private/updateform")){
			action=new CafeUpdateformAction();
		}else if(command.equals("/cafe/private/update")){
			action=new CafeUpdateAction();
		}else if(command.equals("/cafe/private/delete")){
			action=new CafeDeleteAction();
		}else if(command.equals("/cafe/comment_insert")){
			action=new CafeCommentInsertAction();
		}
		return action;
	}
}
