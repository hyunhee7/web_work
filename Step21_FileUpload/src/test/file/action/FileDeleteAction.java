package test.file.action;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;
import org.apache.commons.fileupload.servlet.ServletRequestContext;

import test.controller.Action;
import test.controller.ActionForward;
import test.file.dao.FileDao;
/*
 *  파라미터로 전달되는 파일 번호에 해당하는 파일을 삭제하는 액션
 */
public class FileDeleteAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//1. 삭제할 파일의 번호 얻어오기 
		int num=Integer.parseInt(request.getParameter("num"));
		//삭제할 파일의 저장된 파일명을 읽어온다.
	 	String saveFileName=FileDao.getInstance()
	 			.getData(num).getSaveFileName();
	 	//2. DB 에서 파일정보 삭제
	 	FileDao.getInstance().delete(num);
	 	//3. 파일 시스템에서 삭제 
	 	ServletContext application=request.getServletContext();
	 	//삭제할 파일의 절대 경로 구성하기 
	 	String path=application.getRealPath("/upload")+
	 		File.separator+saveFileName;
	 	//File 객체생성해서 삭제하기 
	 	new File(path).delete();
		
		//목록 보기로 리다일렉트 
		return new ActionForward("/file/list.do", true);
	}
	
}	











