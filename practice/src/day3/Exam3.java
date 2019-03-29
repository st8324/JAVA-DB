package day3;

public class Exam3 {
	public static void main(String[] args){
		int num1=8, num2=12;
		int i, gcd=1;
		/*반복횟수 : i를 1부터 num1까지 하나씩 증가
		실행문
		i가 num1과 num2의 공약수이면
		=>i가 num1의 약수이(고) i가 num2의 약수이(면)
		gcd에 i를 저장한다.
		반복문이 종료된 후 gcd를 출력한다.*/
		for(i=1; i<=num1; i++){
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
			}
		}
		System.out.println(num1+"과 "+num2+"의 최대 공약수 : " + gcd);
	}
}


