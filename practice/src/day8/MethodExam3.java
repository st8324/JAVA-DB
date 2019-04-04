package day8;

import java.util.Scanner;

public class MethodExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int res = printMultiTable(2);
		System.out.println(printMultiTable(2));*/
		//printMultiTable(2);
		printMultiTables(2, 9);
		
	}
	/* 기능 : 단(구구단)을 출력하는 기능
	 * 매개변수 : 단 => 정수 =>int num
	 * 리턴타입 : 없다 => void
	 * 메소드명 : printMultiTable
	 * */
	public static void printMultiTable(int num){
		for(int i=1; i<=9; i++){
			System.out.println(num + " x " + i + " = " + num*i);
		}
	}
	/* 기능 : start단에서 end단을 출력하는 기능
	 * 매개변수 : int start, int end
	 * 리턴타입 : void
	 * 메소드명 : printMultiTables
	 * */
	public static void printMultiTables(int start, int end){
		for(int i=start; i<=end; i++){
			printMultiTable(i);
		}
	}
	/* 메소드에서 리턴값이 있을 때 구현 시 유의사항
	 * 조건문을 통해 return하는 경우나
	 * 반복문안에서 return을 할 경우 조심해야한다.
	 * 조건문을 통해 return할 경우 조건문이 거짓인 경우를 고려해야한다.
	 * 반복문안에서 return을 할 경우 반복문 조건이 거짓이 되어 반복문이 실행되지 않을 경우를
	 * 고려해야한다.
	 * */
	public static int test1(){
		int r = 0;
		for(int i=1; i<= 9; i++){
			r += i;
			return r;
		}
		//반복문이 무조건 실행되서 리턴이 되는 경우라 하더라도 자바 컴파일러는
		//세세한 내용까지 검사하지 않기 때문에 반복문이 종료 됐을 경우 리턴도 설정해주어야한다.
		return 0;
	}
	public static int test(int num){
		if(num >= 0) return 1;
		else return -1;
		
	}
	
}
