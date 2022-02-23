package dukiTest;

public class Login {
	private String name;
	private int age;
	
	Login() {}
		
	public Login(String name , int age) {
	
		validate(name); 
		this.name = name.trim(); 
		this.age  = age;
		
	}

	public void update(String name , int age) {
		
		validate(name); 
		this.name = name.trim();
		this.age  = age;
		
	}
		
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	private void validate(String name) { 
		if("".equals(name) || name == null ||  name.trim().isEmpty() ) {
			throw new IllegalArgumentException(String.format("�߸��� ȸ�� ���̵� �Դϴ�. �̸� = %s, ���� = %s", name, age));
		}
	}
	
}

