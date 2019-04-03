package day7;

public class Test01 {

	public static void main(String[] args) {
		// 1. 구구단 전체를 출력하는 코드를 작성하세요.
		int num = 6;
		for(num=2; num<=9; num++){
			for(int i=1; i<=9; i++){
				System.out.println(num + " x " + i + " = " + num*i);
			}
		}

	}

}
