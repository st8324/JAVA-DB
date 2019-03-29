package day2;

public class Exam15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		//증감연산이 잘못된 경우
		/*for(i=1; i<=10; i--){
			System.out.println("Hello");
		}*/
		//초기화가 잘못된 경우
		/*for(i=-2147483648; i<=10; i++){
			System.out.println("Hello");
		}*/
		//조건식이 잘못된 경우, 무한루프
		for(i=1; 1<=10; i++){
			System.out.println("Hello");
		}
	}

}
