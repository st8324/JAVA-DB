package day4;

public class Exam3 {

	public static void main(String[] args) {
		// 1부터 100까지 짝수만 출력하는 코드를 작성하세요.
		int i;
		for(i=2; i<=100; i+=2){
			System.out.println(i);
		}
		for(i=1; i<=100; i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
		for(i=1; i<=100; i++){
			if(i%2==1){
				continue;
			}
			System.out.println(i);
		}
		for(i=1; i<=50; i++){
			System.out.println(i*2);
		}
	}
}
