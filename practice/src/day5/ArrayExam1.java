package day5;

import java.util.Scanner;

public class ArrayExam1 {

	public static void main(String[] args) {
		/*
		 * 배열은 같은 의미를 가지는 같은 타입의 여러 변수를 하나의 
		 * 묶음으로 다루는 것
		 * 배열의 장점 : 물리적으로 연속된 공간으로 배열을 생성하기 때문에
		 *            접근이 빠르다
		 */
		//정수형 변수를 국어, 영어, 수학, 체육성적과 학년, 반, 번호를
		//저장하기 위해서 배열로 만든다
		//학생 7명의 정수형 변수 국어 성적을 배열로 만든다
		/*
		 * 자료형 [] 배열이름; //배열을 선언
		 * 배열이름 = new 자료형[배열의크기]; //배열 생성
		 * 자료형 배열이름[]; //배열을 선언
		 * 배열이름 = new 자료형[배열의크기]; //배열 생성
		 * 배열의 시작 번지는 0번지부터이다
		 * 배열의 마지막 번지는 배열의크기-1번지까지이다
		 * 배열은 주로 반복문과 사용된다
		 * 잘못된 번지로 접근하면 예외가 발생한다.
		 * =>ArrayIndexOutOfBoundsException
		 * 배열이름.length : 배열의 크기를 알려줌
		 * 자료형 [] 배열이름 = new int[]{값1, 값2, 값3...};
		 * 자료형 [] 배열이름 = {값1, 값2, 값3...};
		 */
		int [] kor;
		kor = new int[10]; //int [] kor = new int[10];
		kor[0] = 10;
		System.out.println(kor[0]);
		System.out.println(kor[9]);
		//System.out.println(kor[10]);//예외 발생
		int i;
		for(i=0; i<kor.length; i++){
			System.out.println(i+"번지 : " + kor[i]);
		}
		/*Scanner scan = new Scanner(System.in);
		for(i=0; i<3; i++){
			kor[i] = scan.nextInt();
		}
		scan.close();*/
		int [] eng;
		eng = kor;
		for(i=0; i<eng.length; i++){
			System.out.println(i+"번지 : " + eng[i]);
		}
		eng[9] = 100;
		for(i=0; i<eng.length; i++){
			System.out.println(i+"번지 : " + kor[i]);
		}
		eng = new int[10];//eng 배열 생성
		//kor 배열의 값을 eng 배열에 복사
		for(i=0; i<eng.length; i++){
			eng[i] = kor[i];
		}
	}

}
