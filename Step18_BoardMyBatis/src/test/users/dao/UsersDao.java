package test.users.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.board.dto.BoardDto;
import test.mybatis.SqlMapConfig;
import test.users.dto.UsersDto;

public class UsersDao {
	private static UsersDao dao;
	//MyBatis 를 사용하기 위한 핵심 객체
	private static SqlSessionFactory factory;
	//생성자
	private UsersDao(){}
	//MemberDao 객체를 리턴해주는 static 맴버 메소드
	public static UsersDao getInstance(){
		if(dao==null){
			dao=new UsersDao();
			//SqlSessionFactory 객체를 얻어와서 맴버필드에 저장 
			factory=SqlMapConfig.getSqlSession();
		}
		return dao;
	}
	public void insert(UsersDto dto){
		//auto commit 되는 SqlSession 객체 얻어오기 
		SqlSession session=factory.openSession(true);
		session.insert("users.insert", dto);
		session.close();
	}
	public boolean isValid(UsersDto dto){
		boolean isValid=false;
		SqlSession session=factory.openSession();
		UsersDto dto1=session.selectOne("users.isValid", dto);
		session.close();
		if(dto1!=null){
			isValid=true;
		}
		return isValid;
	}
}