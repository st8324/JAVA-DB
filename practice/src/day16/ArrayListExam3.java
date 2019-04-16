package day16;

import java.util.Vector;

public class ArrayListExam3 {

	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize();
		System.out.println("==trimToSize()==");
		print(v);
		
		v.ensureCapacity(6);
		System.out.println("==ensureCapacity(6)==");
		print(v);
		
		v.setSize(7);
		System.out.println("==setSize(7)==");
		print(v);
		
		v.clear();
		System.out.println("==clear()==");
		print(v);
	}
	public static void print(Vector v){
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
	}

}








