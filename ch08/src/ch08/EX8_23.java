package ch08;

public class EX8_23 {
	public static void main(String[] args) {
//		command line에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
		try {
			install();
		} catch (InstallException e) {
			System.out.println("에러 메시지 :" + e.getMessage());
			e.printStackTrace();
		} // try-catch의 끝
	} // main

	static void install() throws InstallException { 
		try {
			startInstall(); // 프로그램 설치에 필요한 준비를 한다. 
			copyFiles(); // 파일을 복사 한다.
		} catch (SpaceException e) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(e); 
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTemFiles(); // 프로그램 설치에 사용된 임시파일들을 삭제한다.

		} // try-catch의 끝

	}

	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace())
			throw new SpaceException("설치할 공간이 부족합니다.");
		
		if (!enoughMemory())
			throw new MemoryException("메모리가 부족합니다.");
//		throw new RuntimeException(new MemoryException("메모리가 부족합니다."));

		/* 프로그램 설치에 필요한 준비를 하는 코드를 적는다. */
	}

	static void copyFiles() {
		/* 파일을 복사하는 코드를 적는다. */
	}

	static void deleteTemFiles() {
		/* 임시파일들을 삭제하는 코드를 적는다. */
	}

	static boolean enoughSpace() {
		/* 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다. */
		return false;
	}

	static boolean enoughMemory() {
		/* 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다. */
		return true;
	}

} // EX8_21 End

class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}

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