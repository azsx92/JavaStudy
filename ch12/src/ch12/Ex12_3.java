package ch12;

import java.util.ArrayList;

class Fruit3 {
	public String toString() {
		return "Fruit3";
	}
}

class Apple3 extends Fruit3 {
	public String toString() {
		return "Apple3";
	}
}

class Grape3 extends Fruit3 {
	public String toString() {
		return "Grape3";
	}
}

class Juice {
	String name;

	Juice(String name) {
		this.name = name + "Juice";
	}

	public String toString() {
		return name;
	};
}

class Juicer {
	static Juice makeJuice(FruitBox3 <? extends Fruit3> box3) {
		String tmp = "";

		for (Fruit3 f : box3.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}

public class Ex12_3 {
	public static void main(String[] args) {
		FruitBox3<Fruit3> fruitBox = new FruitBox3<Fruit3>();
		FruitBox3<Apple3> appleBox = new FruitBox3<Apple3>();

		fruitBox.add(new Fruit3());
		fruitBox.add(new Grape3()); // OK void add(Fruit item)

		appleBox.add(new Apple3());
		appleBox.add(new Apple3());


		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));

	}
}

class FruitBox3<T extends Fruit3> extends Box3<T> {
}

class Box3<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	ArrayList<T> getList() {
		return list;
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}
