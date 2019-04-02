package day6;

public class MethodSwapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 20;
		System.out.println(num1 +"," + num2);
		swap(num1,num2);
		System.out.println(num1 +"," + num2);
	}
	public static void swap(int num1, int num2){
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
	}

}
