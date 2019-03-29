package day4;

public class Exam4 {

	public static void main(String[] args) {
		//두 수의 공약수를 출력하는 코드를 작성하세요.
		//8과 12의 공약수 : 1 2 4
		int num1=8, num2=12;
		int i, gcd=1;
		System.out.print(num1+"과 "+num2+"의 공약수 : ");
		for(i=1; i<=num1; i++){
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(num1+"과 "+num2+"의 최대 공약수 : " 
				+ gcd);

	}
}
