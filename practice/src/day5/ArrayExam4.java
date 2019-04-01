package day5;

public class ArrayExam4 {

	public static void main(String[] args) {
		/* 변수의 유효 범위
		 * 일반 변수는 선언되면 해당 변수를 감싸고 있는 괄호안에서 유효하다
		 * 
		 * */
		for(int i = 0; i<10; i++){
			System.out.println(i);
		}
		for(int i=0; i<5; i++){
			System.out.println(i);
		}
		
	}

}
