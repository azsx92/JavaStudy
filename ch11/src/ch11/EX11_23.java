package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EX11_23 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		System.out.println(set);
		
	}
} // end of class


class Person {
	String name;
	int    age;
	
	Person(String name , int age) {
		this.name = name;
		this.age  = age;
	}
	
	public String toString() {
		return name + " : " + age;
	}
}