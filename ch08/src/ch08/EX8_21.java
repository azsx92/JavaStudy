package ch08;

public class EX8_21 {
	public static void main(String[] args){
//		command line���� �Է¹��� ���� �̸����� ���� ������ �����Ѵ�.
		try {
			startInstall();     //���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles();        //������ ���� �Ѵ�.
			deleteTemFiles();   //���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		} catch (SpaceException e) {
			System.out.println("���� �޽��� :" + e.getMessage());
			e.printStackTrace();
		} catch (MemoryException me) {
			System.out.println("���� �޽��� :" + me.getMessage());
			me.printStackTrace();
			System.gc(); //Garbage Collection�� �����Ͽ� �޸𸮸� �÷��ش�.
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���.");
		} finally {
			deleteTemFiles();   //���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		
		} //try-catch�� �� 
	} //main

	
	
	static void startInstall() throws SpaceException , MemoryException{
		if(!enoughSpace()) 
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		if (!enoughMemory())
			throw new MemoryException("�޸𸮰� �����մϴ�.");
			
		/* ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�.*/
	}
	static void copyFiles() {
		/* ������ �����ϴ� �ڵ带 ���´�.*/
	}
	static void deleteTemFiles() {
		/* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�.*/
	}
	
	static boolean enoughSpace() {
		/* ��ġ�ϴµ� �ʿ��� �޸𸮰����� �ִ��� Ȯ���ϴ� �ڵ带 ���´�.*/
		return false;
	}
	
	static boolean enoughMemory() {
		/* ��ġ�ϴµ� �ʿ��� �޸𸮰����� �ִ��� Ȯ���ϴ� �ڵ带 ���´�.*/
		return true;
	}
	
} //EX8_21 End

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}
class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}