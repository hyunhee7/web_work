<%@page import="java.io.File"%>
<%@page import="test.board.dao.FileDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//페이지 이동 list.jsp - delete.jsp - list.jsp
	//삭제할 파일의 번호를 읽어온다.
	int num = Integer.parseInt(request.getParameter("num"));
	//삭제할 파일의 저장된 파일명을 읽어온다.
	String saveFileName = FileDao.getInstance().getData(num).getSaveFileName();
	//1. DB에서 파일 정보 삭제
	FileDao.getInstance().delete(num);
	//2. 파일 시스템에서 삭제
	String path = application.getRealPath("/upload")+
				  File.separator+saveFileName;
	new File(path).delete();
	//3. list.jsp 페이지로 리다일렉트 이동(응답)
	// response.sendRedirect("list.jsp"); //상대경로
	
	//컨텍스트 경로(프로젝트명)
	String cPath = application.getContextPath();
	response.sendRedirect(cPath+"/file/list.jsp"); // 절대경로
	// <a href="/Step05_FileUpload/file/list.jsp"></a>
	//javascript: location
	
	
%>
