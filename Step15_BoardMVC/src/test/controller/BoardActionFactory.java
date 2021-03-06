package test.controller;

import test.board.action.BoardDeleteAction;
import test.board.action.BoardDetailAction;
import test.board.action.BoardInsertAction;
import test.board.action.BoardInsertformAction;
import test.board.action.BoardListAction;
import test.board.action.BoardUpdateAction;

public class BoardActionFactory {
	private static BoardActionFactory factory;
	private BoardActionFactory(){}
	
	public static BoardActionFactory getInstance(){
		if(factory==null){
			factory=new BoardActionFactory();
		}
		return factory;
	}
	
	public Action action(String command){
		Action action=null;
		if(command.equals("/board/list")){
			action=new BoardListAction();
		}else if(command.equals("/board/insertform")){
			action=new BoardInsertformAction();
		}else if(command.equals("/board/insert")){
			action=new BoardInsertAction();
		}else if(command.equals("/board/detail")){
			action=new BoardDetailAction();
		}else if(command.equals("/board/update")){
			action=new BoardUpdateAction();
		}else if(command.equals("/board/delete")){
			action=new BoardDeleteAction();
		}
		return action;
	}
}
