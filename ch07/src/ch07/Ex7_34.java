package ch07;



class Ex7_34 {
		Object iv        = new Object() { void method() {}; };   //�͸�Ŭ����
		static Object cv2 = new Object() { void method() {}; };  //�͸�Ŭ����
		
		void myMethod() {
			Object lv = new Object() { void method() {}; };      //�͸�Ŭ����
		}
}


