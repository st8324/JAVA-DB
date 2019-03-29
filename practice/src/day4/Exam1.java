package day4;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// 두 정수를 입력받아 두 정수의 합을 출력하는 코드를 작성하세요.
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println(num1+"과 " + num2+"의 합 : " + (num1 + num2));
		System.out.println(num1 + num2);
		scan.close();
	}

}
