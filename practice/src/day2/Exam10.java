package day2;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		switch(month){
		case 1:case 3:case 5:case 7:	
		case 8:case 10:case 12:	
			System.out.println("31일");	break;
		case 2:	
			System.out.println("28일");	break;
		case 4:case 6:case 9:case 11:	
			System.out.println("30일");	break;
		default:
			System.out.println("잘못 입력했습니다.");
		}
		scan.close();
	}

}




