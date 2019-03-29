package day2;

public class Exam12 {
	public static void main(String[] args) {
		int i = 0; //반복문에서 사용할 변수
		int sum = 0;
		for(i=1, sum=0; i<=10; i+=1){
			//sum = sum + i;
			sum += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}
}
