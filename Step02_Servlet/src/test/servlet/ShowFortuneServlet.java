package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowFortuneServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String[] list={"동쪽으로 가면 귀인 만나",
				"로또 사면 대박",
				"저녁에 치맥 고고",
				"주말에 이상형만난다",
				"집가다 비맞아"
		};
		
		int index=new Random().nextInt(5);
		String fortune=list[index];
		
		//응답 인코딩 설정
		response.setCharacterEncoding("utf-8");
		//응답 컨텐츠 설정
		response.setContentType("text/html;charset=utf-8");
		//클라이언트에게 출력할 수 있는 객체의 참조값을 얻어온다.
		PrintWriter pw = response.getWriter();
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'/>");
		pw.println("<title>오늘의 운세</title");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h3>오늘의 운세 : "+ fortune +"</h3>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
}
