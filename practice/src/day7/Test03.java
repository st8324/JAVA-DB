package day7;

public class Test03 {

	public static void main(String[] args) {
		// 3. 50이하의 소수를 출력하는 코드를 작성하세요.
		int num = 4;
		int cnt,i;
		for(num=1; num<=50; num++){
			for(i=1,cnt=0; i<=num; i++){
				if(num % i == 0){
					cnt++;
				}
			}
			if(cnt == 2){
				System.out.print(num+" ");
			}
		}

	}

}
