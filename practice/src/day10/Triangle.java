package day10;

public class Triangle extends Shape {
	double area;
	double getArea(){
		return area;
	}
	public Triangle(){}
	public Triangle(int x, int y, int w, int h){
		super(x,y,w,h);
		area = w * h / 2.0;
	}
	@Override
	public void print(){
		System.out.println("삼각형");
		super.print();
		System.out.println("넓이 : " + area);
	}
}
