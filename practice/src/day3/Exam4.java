package day3;

public class Exam4 {

	public static void main(String[] args) {
		/*두 수가 서로소인지 판별하세요.*/
		int num1=3, num2=7;
		int i, gcd=1;
		for(i=1; i<=num1; i++){
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
			}
		}
		if(gcd == 1){
			System.out.println(num1+"과 " + num2+"는 서로소 관계");
		}else{
			System.out.println(num1+"과 " + num2+"는 서로소 관계가 아님");
		}
	}

}
