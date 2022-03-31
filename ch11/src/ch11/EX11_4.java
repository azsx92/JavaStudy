package ch11;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class EX11_4 implements List {

	Object[] data  = null;    // ��ü�� ��� ���� ��ü�迭�� �����Ѵ�.
	int capacity   = 0; 	  // �뷮
	int size       = 0; 	  // ũ��
		
	public EX11_4(int capacity) {
		if(capacity < 0) 
			throw new IllegalArgumentException("��ȿ���� ���� ���Դϴ�. : " + capacity);
		this.capacity = capacity;
		data =  new Object[capacity];
	}
	
	public EX11_4() {
		this(10);  //ũ�⸦ �������� ������ ũ�⸦ 10���� �Ѵ�.
	}
	
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println(" size     :" + v.size());
		System.out.println(" capacity :" + v.capacity());
	}

	
	//�ּ����� �������(capacity)�� Ȯ���ϴ� �޼���
	public void ensureCapacity(int minCapacity) {
		if (minCapacity - data.length > 0)
			setCapctity(minCapacity);
	}
	 

	@Override
	public boolean add(Object obj) {
		// ���ο� ��ü�� �����ѱ� ���� ������ ������ Ȯ���Ѵ�.
		ensureCapacity(size+1);
		data[size++] = obj;
		return true;
	}

	public Object get(int index) {
		if(index < 0  || index >= size)
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		return data[index];
	}

		
	@Override
	public Object remove(int index) {
		Object oldObj = null;
		
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		oldObj = data[index];
		
		//�����ϰ��� �ϴ� ��ü�� ������ ��ü�� �ƴ϶�� , �迭���縦 ���� ���ڸ��� ä����� �Ѵ�.
		if(index != size-1) {
			System.arraycopy(data, index+1, data , index , size-index-1);
		}
		// ������ �����͸� null�� �Ѵ�. �迭�� 0 	���� �����ϹǷ� ������ ��Ҵ� index�� size-1�̴�.
		data[size-1] = null;
		size--;
		return oldObj;
	}
	
	@Override 
	public boolean remove(Object obj) {
		for(int i =0; i< size; i++) {
			if(obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void trimToSize() {
		setCapctity(size);
	}
	
	//�ּ����� �������(capacity)�� Ȯ���ϴ� �޼���
	public void setCapctity(int minCapacity) {
		if(this.capacity == capacity) return; // ũ�Ⱑ ������ �������� �ʴ´�.
		
		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp , 0 , size);
		data = tmp;
		this.capacity = capacity;
		
	}
	
	public void  clear() {
		for(int i = 0; i < size; i++) 
			data[i] = null;
			size = 0;
		
	}
	
	@Override
	public Object[] toArray()  
	{
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		return result;
	}
	
	@Override
	public boolean isEmpty() {		return  size == 0;	}
	public int capacity() {		return  capacity;	}
	public int size() {		return size;	}
	
    /************************************
	  List �������̽��κ��� ��ӹ��� �޼���� 
    ************************************/

//	public int size() {    	return size;	}
//	public boolean isEmpty() {		return  size == 0;	}


	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Object[] toArray(Object[] a) {	return null;	}
	
	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
