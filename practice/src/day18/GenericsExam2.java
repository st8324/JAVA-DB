package day18;

public class GenericsExam2 {

	public static void main(String[] args) {
		FruitBox<Fruit> fBox1 = new FruitBox<>();
		//FruitBox<String> fBox2 = new FruitBox<>();
	}

}
//과일 클래스
class Fruit implements Eat{}
//과일 클래스를 상속받은 사과 클래스
class Apple extends Fruit{}
//과일 박스 지네릭 클래스
//Eat 인터페이스를 구현하고 Fruit클래스를 상속받은 클래스만
//타입변수 T로 올수 있다.
class FruitBox<T extends Fruit & Eat>{}

interface Eat{}



