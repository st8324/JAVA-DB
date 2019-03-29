package day2;

import java.util.Scanner;

public class Exam7 {
	/*
	점수가 주어지면 점수에 맞는 학점을 출력하는 코드를 작성하세요.
	90점이상 ~ 100점이하 : A
	80점이상 ~ 90점미만 : B
	70점이상 ~ 80점미만 : C
	60점이상 ~ 70점미만 : D
	0점이상 ~ 60점미만 : F
	0점미만, 100점 초과 : 잘못된 점수입니다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double score = scan.nextDouble();
		/*if(score>=90 && score <= 100){
			System.out.println("A");
		}else if(score>=80 && score < 90){
			System.out.println("B");
		}else if(score>=70 && score < 80){
			System.out.println("C");
		}else if(score>=60 && score < 70){
			System.out.println("D");
		}else if(score>=0 && score < 60){
			System.out.println("F");
		}else{//else if(score<0 || score>100){
			System.out.println("잘못된 점수입니다.");
		}*/
		if((int)score/10 == 9 || score == 100){
			System.out.println("A");
		}else if((int)score/10 == 8){
			System.out.println("B");
		}else if(score>=70 && score < 80){
			System.out.println("C");
		}else if(score>=60 && score < 70){
			System.out.println("D");
		}else if(score>=0 && score < 60){
			System.out.println("F");
		}else{//else if(score<0 || score>100){
			System.out.println("잘못된 점수입니다.");
		}
		scan.close();
	}

}
