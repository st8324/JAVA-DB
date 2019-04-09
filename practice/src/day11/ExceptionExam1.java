package day11;

public class ExceptionExam1 {
	public static void main(String[] args) {
		int num1=1, num2=0;
		int res;
		int arr[] = new int[10];
		
		try{
			//예외 상황이 발생할 수 있는 코드
			//ArrayIndexOutOfBoundsException가 발생 할 수 있다
			//arr[10] = 0;
			//AtrithtmeticException이 발생 할 수 있다
			res = num1/num2;
			System.out.println(res);
		}
		//try문에서 AtrithmeticException이 발생하면
		//아래 catch문을 실행하고 다음 코드를 실행해라.
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("연산 예외 발생!!!");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열 예외 발생!!!");
		}catch(Exception e){
			System.out.println("예외 발생!!!");
		}
		System.out.println("프로그램 종료!!");
	}
}
