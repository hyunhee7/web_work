package test.dto;
// Data Transfer Object
public class MemberDto {
	private int num;
	private String name;
	private String addr;
	
	//디폴트 생성자
	public MemberDto(){
		
	}
	//필드의 모든 값을 인자로 전달받는 생성자
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}	
	//모든 필드에 대한 setter, getter 메소드
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}


	
}
