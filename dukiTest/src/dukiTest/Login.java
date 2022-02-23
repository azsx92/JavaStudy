package dukiTest;

public class Login {
	private String name;
	private int age;
	
	Login() {
	}
	
	public Login(String name , int age) {
		this.name = name;
		this.age  = age;
		if("".equals(this.name)) {
			System.out.println("회원가입의 이름은 필수 입력사항입니다.");
		} else {
			System.out.println("회원가입" + "이름 :" +this.name +"나이 :" +this.age+" 하였습니다.");
		}
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void update(String name , int age) {
		this.name = name;
		this.age  = age;
		if("".equals(this.name)) {
			System.out.println("회원가입의 이름은 필수 입력사항입니다.");
		} else {	
			System.out.println("회원내용" + "이름 :" +this.name +"나이 :" +this.age+"을 수정 하였습니다.");
		}
	}
	
	
}

