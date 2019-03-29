package day1;

import java.util.Scanner;

public class Exam4 {
	//10과 3의 산술연산 결과를 출력하세요.
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println((double)num1/num2);
		System.out.println(num1%num2);
		scan.close();
	}
}
