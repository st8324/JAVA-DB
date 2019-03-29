package day3;

public class Exam2 {

	public static void main(String[] args) {
		//1부터 10까지의 짝수의 합
		int i;
		int sum = 0;
		/*방법1 : 1부터 10까지 하나씩 증가하면서 
		 * 		 짝수이면 더하고 홀수이면 무시한다.*/
		for(i=1 ; i<=10 ; i++ ){
			if(i % 2 == 0){
				sum += i;
			}
		}
		System.out.println("방법1 : 1부터 10까지 짝수의 합 : " + sum);
		/*방법2 : 2부터 10까지 2개씩 증가하면서 더한다.*/
		for(i=2,sum=0; i<=10; i+=2){
			sum += i;
		}
		System.out.println("방법2 : 1부터 10까지 짝수의 합 : " + sum);
		/*방법3 : 1부터 5까지 하나씩 증가하면서 해당수에 2를 곱해 더한다.*/
		for(i=1, sum=0; i<=5; i++){
			sum += i*2;
		}
		System.out.println("방법3 : 1부터 10까지 짝수의 합 : " + sum);
	}

}




