package day2;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 3;
		//min~ max사이의 정수를 랜덤으로 생성하는 코드
		//com이 가위(1), 바위(2), 보(3)중에서 랜덤으로 하나 선택
		int com = (int)(Math.random()*(max-min+1) + min);
		int user = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요 : >");
		user = scan.nextInt();
		switch(user-com){
		case 0:
			System.out.println("무승부입니다.");
			break;
		case -1: case 2:
			System.out.println("컴퓨터 승입니다.");
			break;
		case 1: case -2://default:
			System.out.println("사용자 승입니다.");
			break;
		}
		scan.close();
	}
}
