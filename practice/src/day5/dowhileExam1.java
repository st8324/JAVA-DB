package day5;

import java.util.Scanner;

public class dowhileExam1 {

	public static void main(String[] args) {
		/* for, while : 조건식에 따라 한번도 실행되지 않을 수 있다.
		 * do while : 조건식에 따라 무조건 1번은 실행 된다.
		 * do{
		 * 		실행문;
		 * }while(조건식);
		 */
		int menu;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("메뉴");
			System.out.println("1.학생정보 추가");
			System.out.println("2.학생정보 수정");
			System.out.println("3.학생정보 삭제");
			System.out.println("4.학생정보 확인");
			System.out.println("5.종료");
			System.out.print("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
		}while(menu != 5);
		scan.close();
	}

}


