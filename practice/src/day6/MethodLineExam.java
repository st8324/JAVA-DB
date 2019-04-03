package day6;

public class MethodLineExam {
	//재사용성이 높은 메소드를 만드는 예제
	public static void main(String[] args) {
		// **********
		// 위처럼 출력되도록 메소드를 만들어보세요.
		printLine(10,'*');
	}
	public static void printLine(int cnt,char ch){
		for(int i=1; i<=cnt; i++){
			System.out.print(ch);
		}
		System.out.println();
	}
}
