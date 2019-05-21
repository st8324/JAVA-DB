package example1;

public class exam4 {
	public static void main(String [] args){
		Point p = new Point();
		p.print();
		p.move(5, 5);
		p.print();
		Point p2 = new Point(p);
		p2.print();
	}
}
