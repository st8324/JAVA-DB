package day9;

public class ClassExam3 {

	public static void main(String[] args) {
		//기본 생성자를 이용한 객체 생성 후 초기화
		SamsungTv t1 = new SamsungTv();
		t1.printChannel();
		t1.printVolumn();
		//생성자 오버로딩을 이용한 객체 생성 후 초기화
		SamsungTv t2 = new SamsungTv(100, 15);
		t2.printChannel();
		t2.printVolumn();
		//t3를 생성해서 t2의 값으로 초기화
		SamsungTv t3 = new SamsungTv(t2);
		System.out.println("t3");
		t3.printChannel();
		t3.printVolumn();
		t3.volumnDown();
		System.out.println("t3 소리 줄이기 실행 후 t3");
		t3.printVolumn();
		System.out.println("t3 소리 줄이기 실행 후 t2");
		t2.printVolumn();
		//t4를 생성하지 않고 t3의 다른이름으로 t4라 부른다
		SamsungTv t4 = t3;
		System.out.println("t3 소리 줄이기 실행 후 t4");
		t4.printVolumn();
	}

}
