package day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionExam {

	public static void main(String[] args) {
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		HashSet<String> hSet = new HashSet<String>();
		list2.add(123);
		list2.add(Integer.parseInt("123"));
		hSet.add("456");
		hSet.add("123");
		System.out.println(hSet);
		Iterator<String> it = hSet.iterator();
		while(it.hasNext()){
			//자식 = (자식)부모
			String obj = (String)it.next();
			
		}
	}
}
