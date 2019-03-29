package day3;

public class Exam6 {

	public static void main(String[] args) {
		//i가 num1의 배수 : i % num1 == 0
		/*반복회수 : i는 1부터 num1*num2까지 하나씩 증가
		실행문
		i가 num1의 배수이고 i가 num2의 배수이면
		lcm에 i를 저장하고 반복문을 빠져나온다.
		반복문이 종료된 후 lcm을 출력한다.*/
		int num1 = 10000, num2 = 20000;
		int i, lcm = 1;
		for(i=1; i<=num1*num2; i+=1){
			if(i % num1 == 0 && i % num2 == 0){
				lcm = i;
				break;
			}
		}
		System.out.println(num1+"과 "+num2+"의 최소 공배수 : " + lcm);
		for(i=num1; i<=num1*num2; i+=num1){
			if(i % num2 == 0){
				lcm = i;
				break;
			}
		}
		System.out.println(num1+"과 "+num2+"의 최소 공배수 : " + lcm);
		int tmp;
		if(num2 > num1){
			// 두 수를 바꾼다
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		for(i=num1; i<=num1*num2; i+=num1){
			if(i % num2 == 0){
				lcm = i;
				break;
			}
		}
		System.out.println(num1+"과 "+num2+"의 최소 공배수 : " + lcm);
	}

}
