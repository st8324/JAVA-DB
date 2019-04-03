package day7;

public class MethodExam {

	public static void main(String[] args) {
		// 구구단 전체를 메소드를 이용하여 출력하도록 작성하세요.
		printAll(2,10);
	}
	/* 기능 : 두 정수가 주어지면 두 정수의 곱을 출력하고 그 결과를 알려주는 메소드
	 * 매개변수 : 두 정수=> int num1, int num2
	 * 리턴타입 : 곱한 결과=>int
	 * 메소드명 : printMul
	 * */
	public static int printMul(int num1, int num2){
		System.out.println(num1 + " X " + num2 + " = " + num1*num2);
		return num1*num2;
	}
	/* 기능 : 단이 주어지면 해당하는 단을 출력하는 메소드
	 * 매개변수 : 단=>int num
	 * 리턴타입 : 없다=>void
	 * 메소드명 : printDan
	 * */
	public static void printDan(int num){
		for(int i =1; i<=9; i++){
			printMul(num,i);
		}
	}
	/* 기능 : start단에서 end단까지 출력하는 메소드
	 * 매개변수 : int start, int end
	 * 리턴타입 : 없다=>void
	 * 메소드명 : printAll
	 * */
	public static void printAll(int start, int end){
		if(start < 0 ) return;
		
		for(int i=start; i<=end; i++){
			printDan(i);
		}
	}
	/* 메소드를 만들 때 지역변수로 할것인가? 매개변수로 할것인가?
	 * 메소드 안에서 변수를 초기화 하는 경우 지역변수로 선언하고
	 * 누군가 알려준 정보를 그대로 활용하면 매개변수로 선언하면
	 * */
}


