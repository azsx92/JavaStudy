package ch07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ex7_35 {
		public static void main(String[] args) {
			Button b = new Button("Start");
			b.addActionListener(new EventHandler());
		}
		
}


class EventHandler implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerforme ocurred!!!");
		
	}
}