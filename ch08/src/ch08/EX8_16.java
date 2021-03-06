package ch08;

import java.io.File;

public class EX8_16 {
	public static void main(String[] args) throws Exception {
//		command line에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + "파일을 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
		}
	} //main

	static File createFile(String fileName) throws Exception {
			if(fileName == null || fileName.equals(""))
				throw new Exception("파일이름이 유효하지 않습니다.");
//			fileName이 부적절한 경우 , 파일 이름을 '제목없음.txt'로 한다.
			File f = new File(fileName); //File클래스의 객체를 만든다.
			createNewFile(f); //생성된 객체를 이용해서 파일을 생성한다.
			return f;
	} // createFile의 끝
	
	static void createNewFile(File f) { 
		try {
			f.createNewFile(); //파일을 생성한다.
		} catch (Exception e) {
			// creatNewFile메서드의 끝
		}
	}
}
