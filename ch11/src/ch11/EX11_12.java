package ch11;

import java.util.PriorityQueue;
import java.util.Queue;

public class EX11_12 {

	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3);  //pq.offer(new Integer(3)); ����ڽ�
		pq.offer(1);  //pq.offer(new Integer(1)); ����ڽ�
		pq.offer(5);  //pq.offer(new Integer(5)); ����ڽ�
		pq.offer(2);  //pq.offer(new Integer(2)); ����ڽ�
		pq.offer(4);  //pq.offer(new Integer(4)); ����ڽ�
		System.out.println(pq);  //pq�� ���� �迭�� ���
		
		Object obj = null;
		//PriorityQueue�� ����� ��Ҹ� �ϳ��� ������.
		while((obj = pq.poll()) !=null) {
			System.out.println(obj);
		}
	}
} // end of class
