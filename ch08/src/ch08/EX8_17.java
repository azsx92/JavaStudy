package ch08;

import java.io.File;

public class EX8_17 {
	public static void main(String[] args) throws Exception {
//		command line���� �Է¹��� ���� �̸����� ���� ������ �����Ѵ�.
		try {
			startInstall();     //���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles();        //������ ���� �Ѵ�.
			deleteTemFiles();   //���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
	
		} catch (Exception e) {
			e.printStackTrace();
			deleteTemFiles();   //���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		} //try-catch�� �� 
	} //main

	
	
	static void startInstall() {
		/* ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�.*/
	}
	static void copyFiles() {
		/* ������ �����ϴ� �ڵ带 ���´�.*/
	}
	static void deleteTemFiles() {
		/* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�.*/
	}
	
}
