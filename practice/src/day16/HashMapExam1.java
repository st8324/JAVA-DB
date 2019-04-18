package day16;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExam1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		//map에서 put메소드는 두개의 매개변수를 가지는데
		//첫번째 매개변수가 key, 두번째 매개변수가 value에 해당
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
			}
			//id가 일치한다면
			else{
				//id가 입력받은 id와 일치하는 value를 입력받은 pw와 비교하여
				//같지 않으면 ==> 입력받은 비밀번호와 id의 비밀번호가 같지 않으면
				if(!(map.get(id)).equals(pw)){
					System.out.println("비밀번호 불일치");
				}
				//일치하면 반복문을 종료 후 프로그램 종료
				else{
					System.out.println("id와 비밀번호가 일치");
					break;
				}
			}
		}
	}
}
