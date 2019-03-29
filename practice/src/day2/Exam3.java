package day2;

public class Exam3 {
	public static void main(String[] args) {
		int num = 11;
		//num가 짝수라면 콘솔에 짝수라고 출력해라
		//num를 2로 나누었을 때 나머지가 0과 같다면 콘솔에 짝수라고 
		//출력해라
		if( num % 2 == 0){
			System.out.println("짝수");
		}
		//위의 조건식이 거짓이면
		else{
			System.out.println("홀수");
		}
	
	}
}
