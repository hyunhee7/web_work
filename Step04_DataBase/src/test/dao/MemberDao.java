package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

/*
 *  Dao => Data Access Object 
 *  
 *  - 회원정보에 대해서  SELECT, INSERT, UPDATE, DELETE 작업을 수행할
 *    객체를 생성하기 위한 클래스 정의하기
 *  - Application 전역에서 MemberDao 객체는 오직1개만 생성될수 있도록
 *    설계한다. 
 */
public class MemberDao {
	//1. 자신의 Type 을 private static 맴버필드로 정의한다.
	private static MemberDao dao;
	//2. 외부에서 객체 생성할수 없도록 생성자의 접근 지정자를 private로 지정
	private MemberDao(){}
	//3. 자신의 참조값을 리턴해주는 static 멤버 메소드를 정의한다.
	public static MemberDao getInstance(){
		if(dao==null){//최초 호출될때는 null 임으로
			dao=new MemberDao(); //객체를 생성해서 필드에 저장한다.
		}
		//필드에 저장된 참조값을 리턴해준다.
		return dao;
	}
	//회원정보 저장
	public boolean insert(MemberDto dto){
		return false;
	}
	//회원정보 수정
	public boolean update(MemberDto dto){
		return false;
	}
	//회원정보 삭제
	public boolean delete(int num){
		return false;
	}
	//회원목록 리턴
	public List<MemberDto> getList(){
		//필요한 객체를 담을 지역변수 만들기
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//회원목록을 담을 객체 생성
		List<MemberDto> list=new ArrayList<>();
		try{
			conn=new DBConnect().getConn();
			String sql="SELECT num,name,addr FROM member "
					+ "ORDER BY num ASC";
			pstmt=conn.prepareStatement(sql);
			//sql 문 수행하고 결과셋 받아오기
			rs=pstmt.executeQuery();
			while(rs.next()){
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				//회원 한명의 정보를 MemberDto 객체에 담는다.
				MemberDto dto=new MemberDto(num, name, addr);
				//MemberDto 객체의 참조값을 ArrayList 에 저장
				list.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
		return list;
	}
}
