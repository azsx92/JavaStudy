package ch08;

import java.io.File;

public class EX8_16 {
	public static void main(String[] args) throws Exception {
//		command line���� �Է¹��� ���� �̸����� ���� ������ �����Ѵ�.
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " �ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
		}
	} //main

	static File createFile(String fileName) throws Exception {
			if(fileName == null || fileName.equals(""))
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
//			fileName�� �������� ��� , ���� �̸��� '�������.txt'�� �Ѵ�.
			File f = new File(fileName); //FileŬ������ ��ü�� �����.
			createNewFile(f); //������ ��ü�� �̿��ؼ� ������ �����Ѵ�.
			return f;
	} // createFile�� ��
	
	static void createNewFile(File f) { 
		try {
			f.createNewFile(); //������ �����Ѵ�.
		} catch (Exception e) {
			// creatNewFile�޼����� ��
		}
	}
}
