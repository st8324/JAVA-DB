package day15;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		int num1, num2;
		char op;
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하세요 (1 / 2):");
		num1 = scan.nextInt();
		op = scan.next().charAt(0);
		num2 = scan.nextInt();
		double res = 0.0;
		switch(op){
		case '+':	res = num1 + num2; break;
		case '-':	res = num1 - num2; break;
		case '*':	res = num1 * num2; break;
		case '/':	res = (double)num1 / num2; break;
		case '%':	res = num1 % num2; break;
		}
		if(num2 == 0 && (op == '/' || op == '%')){
			System.out.println("0으로 나눌 수 없습니다.");
		}else if(op == '/'){
			System.out.println(""+num1 + op + num2 +"="+res);
		}else{
			System.out.println(""+num1 + op + num2 +"="+(int)res);
		}
	}

}



