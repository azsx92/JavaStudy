package ch08;

public class EX8_23 {
	public static void main(String[] args) {
//		command line���� �Է¹��� ���� �̸����� ���� ������ �����Ѵ�.
		try {
			install();
		} catch (InstallException e) {
			System.out.println("���� �޽��� :" + e.getMessage());
			e.printStackTrace();
		} // try-catch�� ��
	} // main

	static void install() throws InstallException { 
		try {
			startInstall(); // ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�. 
			copyFiles(); // ������ ���� �Ѵ�.
		} catch (SpaceException e) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(e); 
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTemFiles(); // ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.

		} // try-catch�� ��

	}

	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace())
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		
		if (!enoughMemory())
			throw new MemoryException("�޸𸮰� �����մϴ�.");
//		throw new RuntimeException(new MemoryException("�޸𸮰� �����մϴ�."));

		/* ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�. */
	}

	static void copyFiles() {
		/* ������ �����ϴ� �ڵ带 ���´�. */
	}

	static void deleteTemFiles() {
		/* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�. */
	}

	static boolean enoughSpace() {
		/* ��ġ�ϴµ� �ʿ��� �޸𸮰����� �ִ��� Ȯ���ϴ� �ڵ带 ���´�. */
		return false;
	}

	static boolean enoughMemory() {
		/* ��ġ�ϴµ� �ʿ��� �޸𸮰����� �ִ��� Ȯ���ϴ� �ڵ带 ���´�. */
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