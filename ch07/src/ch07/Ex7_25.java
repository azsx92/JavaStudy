package ch07;

public class Ex7_25 {
	public static void main(String[] args) {
		Parseable parser  = ParseManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParseManager.getParser("HTML");
		parser.parse("document2.html");
	}
}//

interface Parseable {
//	���� �м��۾��� �����Ѵ�.
	public abstract void parse (String fileName);
}

class ParseManager {
//	����Ÿ���� Parseable �������̽��̴�.
	public static Parseable getParser ( String  type) {
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
//			return new HTMLParser();
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String fileName) {
//		���� �м��۾��� �����ϴ� �ڵ带 ���´�.
		System.out.println(fileName + "- XML parsing completed");
	}
}

class HTMLParser implements Parseable {

	public void parse (String fileName) {
//		���� �м��۾��� �����ϴ� �ڵ带 ���´�.
		System.out.println(fileName + "- HTML parsing completed");
	}
}
