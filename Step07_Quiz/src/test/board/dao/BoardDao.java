package test.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.board.dto.BoardDto;
import test.util.DbcpBean;

public class BoardDao {
	private static BoardDao dao;
	private BoardDao(){}
	
	public static BoardDao getInstance(){
		if(dao==null){
			dao=new BoardDao();
		}
		return dao;
	}	

	
	public boolean insert(BoardDto dto){
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try{
			//Connection 객체의 참조값 얻어오기
			conn=new DbcpBean().getConn();
			String sql="INSERT INTO book_info "
					+ "(num,title,author,publisher,regdate) "
				+ "VALUES(board_guest_seq.NEXTVAL,?,?,?,SYSDATE)";
			pstmt=conn.prepareStatement(sql);
			//? 에 값 바인딩하기
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getAuthor());
			pstmt.setString(3, dto.getPublisher());
			//sql 문 수행하기
			flag=pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				//Connection 객체의 .close() 메소드 호출하면 
				//Connection 객체가 알아서 Pool 에 반납된다. 
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}
		if(flag>0){
			return true; //작업 성공
		}else{
			return false; //작업 실패
		}
	}//insert()	
	
	public List<BoardDto> getList(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<BoardDto> list=new ArrayList<BoardDto>();		
		try{
			conn=new DbcpBean().getConn();
			String sql="SELECT num,title,author,publisher,regdate"
					+ " FROM book_info"
					+ " ORDER BY num DESC";
			pstmt=conn.prepareStatement(sql);
			//sql 문 수행하고 결과셋 받아오기 
			rs=pstmt.executeQuery();
			while(rs.next()){
				int num=rs.getInt("num");
				String title=rs.getString("title");
				String author=rs.getString("author");
				String publisher=rs.getString("publisher");
				String regdate=rs.getString("regdate");
				//글정보를 BoardDto 에 담아서
				BoardDto dto=new BoardDto();
				dto.setNum(num);
				dto.setTitle(title);
				dto.setAuthor(author);
				dto.setPublisher(publisher);
				dto.setRegdate(regdate);
				//List<BoardDto> 객체에 저장한다.
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
		//글목록을 리턴해준다. 
		return list;
	}//getList()
}
