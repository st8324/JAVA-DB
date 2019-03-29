package day3;

public class Exam5 {
	public static void main(String[] args){
		int i = 0;
		int sum = 0;
		for(i=1; i<=10; i++){
			if(i % 2 == 1){
				continue;
			}
			sum += i;
			System.out.println(i);
		}
		System.out.println(sum);
	}
}
