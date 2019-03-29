package day2;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i, cnt;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		//반복횟수 : i는 1부터 num보다 작거나 같을 때까지 1씩 증가한다
		for(i=1,cnt=0; i<=num; i++ ){
			//i가 num의 약수이면 약수의 갯수를 하나 증가
			//num를 i로 나누었을 때 나머지가 0과 같다 => i가 num의 약수
			if(num % i == 0){
				cnt++;//cnt +=1;//cnt = cnt+1;//++cnt;
			}
		}
		//약수의 갯수가 2개이면 소수라고 출력
		if(cnt == 2){
			System.out.println(num+"는 소수");
		}
		//2개가 아니면 소수가 아님이라고 출력
		else{
			System.out.println(num+"는 소수가 아님");
		}
		scan.close();
	}

}
