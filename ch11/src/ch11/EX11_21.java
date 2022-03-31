package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class EX11_21 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i =0; set.size() < 6 ; i++) {
			int num =  (int)(Math.random() * 45) + 1;
			set.add(new Integer(num));  //HashSet�� objArr�� ��ҵ��� �����Ѵ�.
		}
		
		List list  =  new LinkedList(set); //LinkedList(Collection c)
		Collections.sort(list); //Collections.sort(List list)

		
		//HashSet�� ����� ��ҵ��� ����Ѵ�.
		System.out.println(list);

	}
} // end of class
