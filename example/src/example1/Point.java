package example1;

public class Point {
	private int x;
	private int y;
	
	
	public Point(){}
	public Point(Point p)			{	move(p.x,p.y);}
	public Point(int x, int y){	move(x,y);}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void print(){
		System.out.println("("+x+","+y+")");
	}
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	
}
