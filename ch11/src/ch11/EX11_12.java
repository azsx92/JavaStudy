package ch11;

import java.util.PriorityQueue;
import java.util.Queue;

public class EX11_12 {

	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3);  //pq.offer(new Integer(3)); 오토박싱
		pq.offer(1);  //pq.offer(new Integer(1)); 오토박싱
		pq.offer(5);  //pq.offer(new Integer(5)); 오토박싱
		pq.offer(2);  //pq.offer(new Integer(2)); 오토박싱
		pq.offer(4);  //pq.offer(new Integer(4)); 오토박싱
		System.out.println(pq);  //pq의 내부 배열을 출력
		
		Object obj = null;
		//PriorityQueue에 저장된 요소를 하나씩 꺼낸다.
		while((obj = pq.poll()) !=null) {
			System.out.println(obj);
		}
	}
} // end of class
