package day8;

import java.util.Scanner;

public class MethodOverloddingExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMultiTables(1,9);
		printMultiTables();
		System.out.println(7);
		System.out.println('c');
		System.out.println("abc");
		System.out.println(true);
		System.out.println(7.0);
	}
	public static void printMultiTable(int num){
		for(int i=1; i<=9; i++){
			System.out.println(num + " x " + i + " = " + num*i);
		}
	}
	public static void printMultiTables(int start, int end){
		for(int i=start; i<=end; i++){
			printMultiTable(i);
		}
	}
	/* 기능 : 구구단 전체(2단~9단)이 출력되는 기능
	 */
	public static void printMultiTables(){
		printMultiTables(2,9);
	}
}
