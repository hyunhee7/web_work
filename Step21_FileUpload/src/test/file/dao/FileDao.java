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
	public static FileDao getInstance(){
		if(dao==null){
			dao=new FileDao();
			factory=SqlMapConfig.getSqlSession();
		}
		return dao;
	}
	public List<FileDto> getList(){
		SqlSession session=factory.openSession();
		List<FileDto> list=session.selectList("file.getList");
		session.close();
		
		return list;
	}
	//파일의 정보를 리턴해주는 메소드
	public FileDto getData(int num){
		SqlSession session=factory.openSession();
		FileDto dto=session.selectOne("file.getData", num);
		session.close();
		return dto;
	}
	//파일의 정보를 저장하는 메소드
	public void insert(FileDto dto){
		SqlSession session=factory.openSession(true);
		session.insert("file.insert", dto);
		session.close();
	}
	//파일 정보를 삭제하는 메소드
	public void delete(int num){
		SqlSession session=factory.openSession(true);
		session.delete("file.delete", num);
		session.close();
	}
}











