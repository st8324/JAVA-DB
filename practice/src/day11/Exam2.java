package day11;

public class Exam2 {
	public static void main(String[] args) {
		print(new A(){
			public void test(){
				System.out.println("test");
			}
		});
	}
	public static void print(A a){
		a.test();
	}
}
interface A{
	void test();
}
/*class B implements A{
	public void test(){}
}*/