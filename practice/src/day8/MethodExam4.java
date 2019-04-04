package day8;

public class MethodExam4 {

	public static void main(String[] args) {
		//java.lang.StackOverflowError 발생
		//print();
		System.out.println(factorial(5));
	}
	
	/* 기능 : 정수 num이 주어지면 주어진 정수 num!를 알려주는 메소드
	 * 매개변수 : int num
	 * 리턴타입 : num!=>int
	 * 메소드명 : factorial
	 */
	public static int factorial(int num){
		if(num == 1 || num == 0)
			return 1;
		if(num < 0)
			return -1;
		return factorial(num-1)*num;
	}
	//잘못된 재귀메소드 예제
		public static void print(){
			System.out.println("Hello");
			print();
		}
}




