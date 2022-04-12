package msShk1;

public class Student {
	private String name;
	private String no;
	
	// getter , settet , 생성자를 만듬
	// 생성자 만들 때 name, no 를 받아서 멤버변수 name 과 no 를 초기화 할 수 있도록 작성
	
	
	public Student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}

	
	
	
}
