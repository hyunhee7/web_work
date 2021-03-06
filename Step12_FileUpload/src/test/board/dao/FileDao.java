package test.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.board.dto.FileDto;
import test.util.DbcpBean;

public class FileDao {
	private static FileDao dao;
	private FileDao(){}
	//자신의 참조값을 리턴해주는 static 맴버 메소드 
	public static FileDao getInstance(){
		if(dao==null){
			dao=new FileDao();
		}
		return dao;
	}
	
	//파일 하나의 정보를 삭제하는 메소드
	public boolean delete(int num){
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			conn = new DbcpBean().getConn();
			String sql = "DELETE FROM board_data WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			flag = pstmt.executeUpdate();

		} catch (Exception se) {
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

	}
	//파일 하나의 정보를 리턴해주는 메소드
	public FileDto getData(int num){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//파일 하나의 정보를 담을 FileDto 
		FileDto dto=null;
		try {
			conn = new DbcpBean().getConn();
			String sql = "SELECT writer,title,"
					+ "orgFileName,saveFileName,fileSize,regdate"
					+ " FROM board_data"
					+ " WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto=new FileDto();
				dto.setNum(num);
				dto.setWriter(rs.getString("writer"));
				dto.setTitle(rs.getString("title"));
				dto.setOrgFileName(rs.getString("orgFileName"));
				dto.setSaveFileName(rs.getString("saveFileName"));
				dto.setFileSize(rs.getLong("fileSize"));
				dto.setRegdate(rs.getString("regdate"));
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
		return dto;
	}
	
	
	//파일 목록을 리턴해주는 메소드
	public List<FileDto> getList(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//파일 목록을 담을 ArrayList 객체 생성 
		List<FileDto> list=new ArrayList<>();
		try {
			conn = new DbcpBean().getConn();
			//파일 정보 SELECT 문 구성하기 
			String sql = "SELECT num,writer,title,orgFileName,"
					+ "saveFileName,fileSize,regdate "
					+ "FROM board_data "
					+ "ORDER BY num DESC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				//ResultSet 에 있는 파일 정보를 FileDto 객체에 담아서 
				FileDto dto=new FileDto();
				dto.setNum(rs.getInt("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setTitle(rs.getString("title"));
				dto.setOrgFileName(rs.getString("orgFileName"));
				dto.setSaveFileName(rs.getString("saveFileName"));
				dto.setFileSize(rs.getLong("fileSize"));
				dto.setRegdate(rs.getString("regdate"));
				//ArrayList 객체에 누적 시킨다.
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
		//파일 목록을 리턴 해 준다. 
		return list;
	}
	
	
	//파일 정보를 DB 에 저장하는 메소드
	public boolean insert(FileDto dto){
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			conn = new DbcpBean().getConn();
			String sql = "INSERT INTO board_data VALUES"
					+ "(board_data_seq.NEXTVAL,?,?,?,?,?,SYSDATE)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getOrgFileName());
			pstmt.setString(4, dto.getSaveFileName());
			pstmt.setLong(5, dto.getFileSize());
			
			flag = pstmt.executeUpdate();
			System.out.println(flag);
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
	}
}





