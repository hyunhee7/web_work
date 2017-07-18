package test.file.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.file.dto.FileDto;
import test.mybatis.SqlMapConfig;

public class FileDao {
	private static FileDao dao;
	private static SqlSessionFactory factory;
	private FileDao(){}
	//자신의 참조값을 리턴해주는 static 맴버 메소드 
	public static FileDao getInstance(){
		if(dao==null){
			dao=new FileDao();
			//SqlSessionFactory 객체를 얻어와서 맴버필드에 저장 
			factory=SqlMapConfig.getSqlSession();
		}
		return dao;
	}
	
	public List<FileDto> getList(){
		//SqlSession 객체의 참조값 얻어오기 
		SqlSession session=factory.openSession();
		/*	Mapper.xml 문서의 namespace => board
		 *  sql 문의 id => getList
		 *  resultType => BoardDto
		 */
		List<FileDto> list=session.selectList("file.getList");
		session.close();
		return list;
	}	
	public boolean insert(FileDto dto){
		//auto commit 되는 SqlSession 객체 얻어오기 
		SqlSession session=factory.openSession(true);
		session.insert("file.insert", dto);

		session.close();
	}		
}
