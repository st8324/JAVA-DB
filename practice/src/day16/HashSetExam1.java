package day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExam1 {

	public static void main(String[] args) {
		Object [] obj = {"1", new Integer(1), "2","2", 
				"2", "3", "3", "3", "4", "1"};
		Set set = new HashSet();
		for(int i = 0; i<obj.length; i++){
			set.add(obj[i]);
		}
		System.out.println(set);
	}

}
