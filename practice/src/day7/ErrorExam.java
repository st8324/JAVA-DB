package day7;

public class ErrorExam {

	public static void main(String[] args) {
		// 에러 내용 : The local variable xxx may not have been initialized
		// 에러 원인 : 지역변수를 초기화 하지 않고 사용하는 경우
		// 해결 방법 : 해당 지역변수를 초기화한다.
		int num;
		//System.out.println(num);//에러 발생 코드1
		// 에러 내용 : xxx cannot be resolved to a variable
		// 에러 원인 : 변수를 선언하지 않고 사용하는 경우
		// 해결 방법 : 변수를 선언한다.
		//System.out.println(num2);//에러 발생 코드2
		
		// 에러 내용 : java.lang.ArithmeticException: / by zero
		// 에러 원인 : 0으로 나누었을 경우
		// 해결 방법 : 0으로 나누는 상황을 피한다.
		//int num3 = 1/0;//에러 발생 코드3
		
		// 에러 내용 : java.lang.ArrayIndexOutOfBoundsException: xx
		// 에러 원인 : 배열의 유효하지 않는 번지로 접근하는 경우
		// 해결 방법 : 배열의 유효한 번지로 접근한다.
		int []arr = new int[5];
		//arr[5] = 1; //에러 발생 코드4
		
		// 에러 내용 : Syntax error, insert "}" to complete ClassBody
		// 에러 원인 : } 실수
		// 해결 방법 : }의 짝을 맞춘다.
		//for(int i=0; i<5; i++){//에러 발생 코드5

	}

}
