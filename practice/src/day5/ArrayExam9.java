package day5;

public class ArrayExam9 {

	public static void main(String[] args) {
		//두 수 공약수들을 배열에 저장하여 출력하는 코드를 작성하세요.
		//최대 10개를 저장가능
		int num1=8, num2=12;
		int i;
		int [] arr = new int [10];//추가된 부분
		int cnt = 0;//공약수의 갯수, 추가된 부분
		for(i=1; i<=num1; i++){
			if(cnt == 10){
				break;
			}
			if(num1 % i == 0 && num2 % i == 0){
				arr[cnt] = i;//추가된 부분
				cnt++;//공약수 갯수를 하나 증가
			}
		}
		//추가된 부분
		for(int j = 0; j<cnt; j++){
			System.out.print(arr[j] + " ");
		}
	}

}
