package ch11;

import java.util.Iterator;

public class EX11_16 extends EX11_4 implements Iterator {
	int cursor  =  0;
	int lastRet = -1;

	public EX11_16(int capacity) {
		super(capacity);
	}

	public EX11_16() {
		this(10); 
	}

	public String toString() {
		String tmp  = "";
		Iterator it = iterator();

		for (int i = 0; it.hasNext(); i++) {
			if (i != 0)	tmp += ", ";
			tmp += it.next(); // tmp += it.next().toString();
		}
		return "[" + tmp + "]";
	}

	public Iterator iterator() {
		cursor  = 0; // cursor�� lastRet�� �ʱ�ȭ �Ѵ�.
		lastRet = -1;
		return this;
	}

	@Override
	public boolean hasNext() {
		return cursor != size();
	}

	@Override
	public Object next() {
		Object next = get(cursor);
		lastRet     = cursor++;
		return next;
	}
	
	public void remove() {
//		�� �̻� ������ ���� ������ ILLegalStateException�� �߻���Ų��.
		if(lastRet == -1) {
			throw new IllegalStateException();
		} else {
			remove(lastRet);
	//		cursor--;       //���� �Ŀ� cursor�� ��ġ�� ���ҽ�Ų��. ���� ��  :[1, 3, 4]
			cursor--;       //���� �Ŀ� cursor�� ��ġ�� ���ҽ�Ų��. ���� ��  :[2, 3, 4]
			lastRet = -1;   //lastRet�� ���� �ʱ�ȭ �Ѵ�.
		}
	}
} // end of class
