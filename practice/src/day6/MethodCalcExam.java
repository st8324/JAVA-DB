package day6;

public class MethodCalcExam {

	public static void main(String[] args) {
		System.out.println(calc2(1,2,'/'));
		double res = calc(1,2,'/');
		System.out.println(res);
	}
	/*
	기능 :두 정수와 산술연산자가 주어졌을 때 연산 결과를 알려주는 메소드
	매개변수 : 두정수와 산술연산자=> int num1, int num2, char op
	리턴타입 : 계산결과=> double
	메소드명 : calc
	 */
	public static double calc(int num1, int num2, char op){
		double res = 0.0;
		switch(op){
		case '+':	res = num1+num2;		break;
		case '-':	res = num1-num2;		break;
		case '*':	res = num1*num2;		break;
		case '/':	res = num1/(double)num2;break;
		case '%':	res = num1%num2;		break;
		}
		return res;
	}
	/* 안좋은 메소드 예시
	 * */
	public static double calc2(int num1, int num2, char op){
		double res = 0.0;
		switch(op){
		case '+':	
			System.out.println("" + num1 
				+ op + num2 +"=" + (num1 + num2));		
		break;
		case '-':
			System.out.println("" + num1 
					+ op + num2 +"=" + (num1 - num2));	
			break;
		case '*':
			System.out.println("" + num1 
					+ op + num2 +"=" + (num1 * num2));	
			break;
		case '/':	
			System.out.println("" + num1 
					+ op + num2 +"=" + (num1 / (double)num2));	
			break;
		case '%':	
			System.out.println("" + num1 
					+ op + num2 +"=" + (num1 % num2));	
			break;
		}
		return res;
	}

}
