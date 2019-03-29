package day1;

import java.util.Scanner;

public class Exam2 {
	//콘솔에서 숫자를 입력받아 입력받은 숫자를 출력하세요.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("입력한 수 : " + num);
		scan.close();
	}

}
