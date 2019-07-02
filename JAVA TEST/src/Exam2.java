
public class Exam2 {

	public static void main(String[] args) {
		// 지역변수 : 메소드 안에 선언되어 해당 메소드에서만 동작하는 
		// 변수로 위치에 따라 변수 범위가 다르다
		// 선언 위치부터 사용할 수 있으며 해당 위치가 포함된 {}안에서만 사용가능하다.
		int num1;//num1은 현재 위치부터 main메소드 끝까지 사용 가능
		//i는 반복문 시작시 변수 선언이 되어 방복문 안에서 사용하며 반복문이 종료되면 사용할 수 없다.
		for(int i = 0; i<1; i++){
			//tmp는 반복문 실행문 시작시 변수 선언이 되어 실행문 종료 후 사용할 수 없다.
			//tmp는 반복문이 실행될때마다 값을 유지할 수 없다.
			//tmp는 실행문이 실행될때마다 다시 생성한다.
			int tmp;
			//참조변수(객체) : 변수가 일반 자료형으로 생성된 변수가 아닌 클래스를 이용하여 생성된 변수
			//         를 참조 변수 라한다. 일반 변수는 값을 저장하지만 참조변수는 주소를 저장한다.
			//참조변수를 매개변수로 하면 원본이 바뀔 수 있다.test(Point p)처럼 바뀔수도 잇지만
			//test2(Point p)처럼 코드 구현에 따라 안바뀔수도 있다.
			Point p = new Point();
			int num3 = 10;
			test(num3);
			System.out.println(num3);
			System.out.println(p);
			test(p);
			System.out.println(p);
			test2(p);
			System.out.println(p);
		}
	}
	public static void test(int num){
		++num;
	}
	public static void test(Point p){
		p.move(1, 1);
	}
	public static void test2(Point p){
		p = new Point();
		p.move(2, 2);
	}
}




