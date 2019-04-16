package day16;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExam1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		//key값이 중복됐을 때 value를 어떻게 처리할 것인가???
		//key값이 중복되면 value의 값을 덮어쓴다
		map.put("asdf", "1234");
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("id와 pw를 입력해주세요.");
			System.out.print("id : ");
			//문자열의 모든 공백을 제거 : trim()
			String id = scan.nextLine().trim();
			
			System.out.print("pw : ");
			String pw = scan.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)){
				System.out.println("존재하지 않는 id입니다. 재입력하세요");
			}else{
				if(!(map.get(id)).equals(pw)){
					System.out.println("비밀번호 불일치");
				}else{
					System.out.println("id와 비밀번호가 일치");
					break;
				}
			}
		}
	}
}
