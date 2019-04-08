package day10;

public class Circle extends Shape {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void print(){
		System.out.print("중심점 : ");
		center.print();
		System.out.println("반지름 : "+ radius);
	}
	public Circle(){
		//super();
	}
	public Circle(int x, int y, int r){
		super(x,y,r,r);
		radius = r;
	}
}
