package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EX11_24 {
	public static void main(String[] args) {
		Set set = new HashSet();

		set.add("abc");
		set.add("abc");
		set.add(new Person2("David", 10));
		set.add(new Person2("David", 10));

		System.out.println(set);

	}
} // end of class

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Person2) {
			Person2 tmp = (Person2) obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}

	public int hashCode() {
		return (name + age).hashCode();
	}

	public String toString() {
		return name + " : " + age;
	}
}