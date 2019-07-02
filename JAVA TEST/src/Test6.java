import java.util.ArrayList;
import java.util.Iterator;

public class Test6 {

	public static void main(String[] args) {
		// 6. 5에서 생성한 Point 클래스를 이용하여 점의 이동 경로를 저장하는 코드를 작성하세요.
		ArrayList<Point> pointPath = new ArrayList<>();
		Point p = new Point();
		pointPath.add(new Point(p));
		p.move(4, 4);
		pointPath.add(new Point(p));
		p.move(10, 10);
		pointPath.add(new Point(p));
		
		Iterator<Point> it = pointPath.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}





