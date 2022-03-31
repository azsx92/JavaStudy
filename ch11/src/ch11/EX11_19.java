package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class EX11_19 {
	public static void main(String[] args) {
		String[] strArr = { "cat", "Dog", "lion", "tiger" };

		Arrays.sort(strArr); /// String�� Comparable������ ���� ����
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); /// ����� ���� ����
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending()); /// String�� Comparable������ ���� ����
		System.out.println("strArr=" + Arrays.toString(strArr));

	}
} // end of class

class Descending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1  = (Comparable) o1;
			Comparable c2  = (Comparable) o2;
			return c1.compareTo(c2) * -1; // -1�� ���ؼ� �⺻ ���Ĺ���� ������ �����Ѵ�. �Ǵ� c2.compareTo((��1) ���� ������ �ٲ㵵 �ȴ�.
			
		}
		return -1;
	}
}