package ch07;



class Ex7_34 {
		Object iv        = new Object() { void method() {}; };   //익명클래스
		static Object cv2 = new Object() { void method() {}; };  //익명클래스
		
		void myMethod() {
			Object lv = new Object() { void method() {}; };      //익명클래스
		}
}


