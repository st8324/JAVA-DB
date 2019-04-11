package day13;

public class ForExam1 {

	public static void main(String[] args) {
		// 구구단 전체를 출력하는 코드를 작성하세요.
		int num = 4;
		for(num = 2; num<=9; num++){
			for(int i=1; i<=9; i++){
				System.out.println(num + " X " + i + " = " + num*i);
			}
		}
	}
}
