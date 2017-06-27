package test.board.dto;

public class BoardDto {
	private int num; 
	private String title;
	private String author;
	private String publisher;
	private String regdate;
	
	public BoardDto(){
		
	}

	public BoardDto(int num, String title, String author, String publisher, String regdate) {
		super();
		this.num = num;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.regdate = regdate;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
}
