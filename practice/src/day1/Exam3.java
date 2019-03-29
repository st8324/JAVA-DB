package day1;

import java.util.Scanner;

public class Exam3 {
/*	콘솔에서 숫자를 입력받아 입력받은 숫자가 1보다 크거나
	같고 100보다 작거나 같은지 출력하세요.
*/	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		// 1 <= num <= 100
		// 1 <= num && num <= 100
		boolean isScore = false;
		isScore = (1 <= num) && (num <= 100);
		System.out.println(isScore);
		//System.out.println(1 <= num && num <= 100);
		scan.close();
	}

}
