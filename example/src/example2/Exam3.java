package example2;

import java.util.ArrayList;
import java.util.Collections;

public class Exam3 {

	public static void main(String[] args) {
		// 1~6을 ArrayList에 순서대로 저장하고 	해당 ArrayList를 섞는 코드를 작성하세요.
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i<=6; i++){
			list.add(i);
		}
		System.out.println(list);
		for(int i = 0; i<6 ;i++){
			int r = (int)(Math.random()*6);
			int tmp = list.get(r);
			list.set(r, list.get(i));
			list.set(i, tmp);
		}
		System.out.println(list);
		
		
		list.clear();
		for(int i = 1; i<=6; i++){
			list.add(i);
		}
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}

}






