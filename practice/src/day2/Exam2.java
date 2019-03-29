package day2;

public class Exam2 {

	public static void main(String[] args) {
		int num = 10;
		//num가 짝수라면 콘솔에 짝수라고 출력해라
		//num를 2로 나누었을 때 나머지가 0과 같다면 콘솔에 짝수라고 
		//출력해라
		if( num % 2 == 0){
			System.out.println("짝수");
		}
		//num가 홀수라면 콘솔에 홀수라고 출력
		if( num % 2 == 1){
			System.out.println("홀수");
		}
	}
}
