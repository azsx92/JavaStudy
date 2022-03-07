package ch08;

import java.io.File;

public class EX8_17 {
	public static void main(String[] args) throws Exception {
//		command line에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
		try {
			startInstall();     //프로그램 설치에 필요한 준비를 한다.
			copyFiles();        //파일을 복사 한다.
			deleteTemFiles();   //프로그램 설치에 사용된 임시파일들을 삭제한다.
	
		} catch (Exception e) {
			e.printStackTrace();
			deleteTemFiles();   //프로그램 설치에 사용된 임시파일들을 삭제한다.
		} //try-catch의 끝 
	} //main

	
	
	static void startInstall() {
		/* 프로그램 설치에 필요한 준비를 하는 코드를 적는다.*/
	}
	static void copyFiles() {
		/* 파일을 복사하는 코드를 적는다.*/
	}
	static void deleteTemFiles() {
		/* 임시파일들을 삭제하는 코드를 적는다.*/
	}
	
}
