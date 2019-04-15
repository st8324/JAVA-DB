package day15;

public class Exam {

	public static void main(String[] args) {
		// 사각형 클래스를 만들고 테스트 해보세요 
		Rect r = new Rect();
		r.width = 10;
		r.height = 5;
		r.centerX = 0;
		r.centerY = 0;
		r.print();
		r.move(5, 5);
		r.print();
		r.resize(10, 10);
		r.print();
	}
}
class Rect{
	public int width;
	public int height;
	public int centerX;
	public int centerY;
	public void print(){
		System.out.println("중심점 : " + centerX +","+centerY);
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("넓이 : " + width*height);
	}
	public void move(int x, int y){
		this.centerX = x;
		this.centerY = y;
	}
	public void resize(int width, int height){
		this.width = width;
		this.height = height;
	}
}


