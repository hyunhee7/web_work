package test.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			conn = new DbcpBean().getConn();
			String sql = "INSERT INTO board_guest "
					+"(num,writer,title,content,regdate) "
					+"VALUES(board_guest_seq.NEXTVAL,?,?,?,SYSDATE)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
			flag = pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		if (flag > 0) {
			return true;
		} else {
			return false;
		}
	}//insert
	
	public List<BoardDto> getList(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardDto> list=new ArrayList<BoardDto>();
		try {
			conn = new DbcpBean().getConn();
			String sql = "SELECT num,writer,title,TO_CHAR(regdate,'YYYY.MM.DD AM HH:MI') regdate"
					+ " FROM board_guest"
					+ " ORDER BY num DESC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int num=rs.getInt("num");
				String writer=rs.getString("writer");
				String title=rs.getString("title");
				String regdate=rs.getString("regdate");
				
				BoardDto dto=new BoardDto();
				dto.setNum(num);
				dto.setWriter(writer);
				dto.setTitle(title);
				dto.setRegdate(regdate);
				list.add(dto);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return list;
	}
	
	//인자로 전달되는 번호에 해당하는 글 정보를 리턴해주는 메소드
	public BoardDto getData(int num){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		BoardDto dto=null;
		try{
			conn=new DbcpBean().getConn();
			String sql="SELECT writer,title,content,regdate "
					+ "FROM board_guest WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			//? 에 값 바인딩하기
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()){
				String writer=rs.getString("writer");
				String title=rs.getString("title");
				String content=rs.getString("content");
				String regdate=rs.getString("regdate");
				//글정보를 BoardDto 에 담기 
				dto=new BoardDto(num, writer, title, content, regdate);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}//try
		//글정보가 담긴 BoardDto 객체를 리턴해준다.
		return dto;
	}//getData()
	
	//글정보를 수정하는 메소드
	public boolean update(BoardDto dto){
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try{
			conn=new DbcpBean().getConn();
			String sql="UPDATE board_guest "
					+ "SET writer=?,title=?,content=? "
					+ "WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
			pstmt.setInt(4, dto.getNum());
			flag=pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}//try
		
		if(flag>0){
			return true;
		}else{
			return false;
		}
	}//update()
	
	//인자로 전달되는 글번호를 이용해서 해당 글을 삭제하는 메소드
	public boolean delete(int num){
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try{
			conn=new DbcpBean().getConn();
			String sql="DELETE FROM board_guest WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			flag=pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e){}
		}//try
		if(flag>0){
			return true;
		}else{
			return false;
		}
	}//delete()
		
}
