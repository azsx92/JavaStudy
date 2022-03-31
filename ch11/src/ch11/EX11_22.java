package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EX11_22 {
	public static void main(String[] args) {
		Set set = new HashSet();
//		Set set =  new LinkedHashSet(); //LinkedHashSet
		int [] [] board = new int [5][5];
		
		for(int i =0; set.size() < 25 ; i++) {
			set.add((int)(Math.random() * 50) + 1+"");  //HashSet에 objArr의 요소들을 저장한다.
		}
		
		Iterator it = set.iterator();
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) { 
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}
	}
} // end of class
