package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class EX11_30 {
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("myid", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in); //ȭ�����κ��� ���δ����� �Է¹޴´�.
		
		while(true) {
			System.out.println("id�� password�� �Է����ּ���.");
			System.out.println("id :");
			
			String id = s.nextLine().trim();
			
			System.out.println("password :");
			String password = s.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�." + "�ٽ� �Է��� �ּ���.");
				
				continue;
			} else {
				if(!(map.get(id)).equals(password)) {
					System.out.println("�Է��Ͻ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�." + "�ٽ� �Է��� �ּ���.");
				} else {
					System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
					break;
				}
			}
		} //while  end
		
	}
} // end of class 