package day6;

public class MethodPrimeExam {

	public static void main(String[] args) {
		int num = 8;
		if(isPrime(num)){
			System.out.println("소수");
		}else{
			System.out.println("합성수");
		}
		
	}
	/* 기능 : 정수가 주어지면 해당 정수가 소수이면 참을 합성수이면 거짓을 알려주는 메소드
	 * 매개변수 : 정수 => int num
	 * 리턴타입 : 참,거짓 =>boolean
	 * 메소드명 : isPrime
	 * */
	public static boolean isPrime(int num){
		int cnt = 0;
		for(int i=1; i<=num; i++){
			if(num%i==0){
				cnt++;
			}
		}
		if(cnt == 2){
			return true;
		}else{
			return false;
		}
	}
}
