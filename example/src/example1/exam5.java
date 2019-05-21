package example1;

public class exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D();
		p.print();
		p.move(5, 5, 5);
		p.print();
		p.move(10, 10);
		p.print();
		Point3D p2 = new Point3D(p);
		p2.print();
	}

}
