package dukiTest;

public class DukTest2 {
   public static void main(String[] args) {
	Login login  = new Login( "" , 10); 
//	Login login  = new Login( "                    " , 10); 
	Login login2 = new Login("pin2" , 20); 
	Login login3 = new Login("pin3" , 30);
	System.out.println(login.getName() + login.getAge());
	
//	¼öÁ¤
	/*	
	login.update("aaa", 300); 
	login2.update("peace2", 400);
	login3.update("peace3", 400);

	
	System.out.println(login2.getName() + login2.getAge());
	System.out.println(login3.getName() + login3.getAge());	
	
	*/
   }
}
