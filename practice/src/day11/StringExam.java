package day11;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		System.out.print("문자열을 입력하세요.: ");
		str = scan.nextLine();
		System.out.print("찾을 문자열을 입력하세요.: ");
		String search = scan.nextLine();
		if(str.contains(search)){
			System.out.println(str+"에는 "+search+"가 있습니다.");
		}else{
			System.out.println(str+"에는 "+search+"가 없습니다.");
		}
		if(str.indexOf(search) >= 0){
			System.out.println(str+"에는 "+search+"가 있습니다.");
		}else{
			System.out.println(str+"에는 "+search+"가 없습니다.");
		}
		scan.close();
	}
	
}
