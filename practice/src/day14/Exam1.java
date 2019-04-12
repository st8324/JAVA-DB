package day14;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam1 {

	public static void main(String[] args) {
		System.out.println(1.0/0.0);
		try {		System.out.println(calc(1.0,2.0,'+'));
		}catch (Exception e) {	System.out.println(e.getMessage());	}
	}
	public static double calc(double num1, double num2, char op) 
			throws Exception, ArithmeticException{
		double res = 0.0;
		if((op == '/' || op == '%') && num2 == 0.0)	
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		switch(op){
		case '+':	res = num1 + num2; break;
		case '-':	res = num1 - num2; break;
		case '*':	res = num1 * num2; break;
		case '/':	res = num1 / num2; break;
		case '%':	res = num1 % num2; break;
		default:	throw new Exception("잘못된 연산자입니다.");
		}
		return res;
	}
}







