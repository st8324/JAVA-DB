package day2;

import java.util.Scanner;

public class Exam1 {
/*	정수를 입력받아 입력받은 정수가 짝수인지 아닌지 확인하는
	코드를 작성하세요.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		num = scan.nextInt();
		
		//짝수 : num를 2로 (나누었을 때 나머지)가 0과 (같다)
		boolean isEven = num % 2 == 0;
		System.out.println(isEven);
		scan.close();
	}

}





