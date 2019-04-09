package day11;

import java.util.Scanner;

public class StringExam2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = new String();
		String searchStr = "";
		String replaceStr = "";
		System.out.print("문자열을 입력 : ");
		str = scan.nextLine();
		System.out.print("교체될 문자열 : ");
		searchStr = scan.nextLine();
		System.out.print("교체할 문자열 : ");
		replaceStr = scan.nextLine();
		
		String newStr = "";
		newStr = str.replaceAll(searchStr, replaceStr);
		if(newStr == str){
			System.out.println("교체될 문자열이 없습니다.");
		}else{
			System.out.println("교체된 문자열 : "+newStr);
		}
	}

}





