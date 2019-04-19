package day19;

import java.util.*;

public class StdManager {
	/* 매니저는 학생 정보들을 관리하기 위한 저장공간이 필요
	 * 쉽게 정보들을 관리하기 위해 컬렉션 프레임웍이 필요
	 * 그런데 학생 정보들은 중복되면 안되기 때문에 Set을 이용해야한다
	 * (List를 이용할 경우 중복처리를 해줘야하는 번거로움이 있다)
	 * 학생 정보는 기능을 통해 접근해야지 외부에서 직접 접근하면 안되기 때문에
	 * 접근제한자를 private으로 한다
	 */
	private HashSet<Std> list = new HashSet<Std>();
	/* 기능 : 학생정보가 주어지면 해당 학생 정보를 list에서 중복되지 않으면
	 *       추가하고 아니면 추가하지 않으며 추가했을 경우 성공을,
	 *       추가하지 못하면 실패를 알려주는 기능
	 * 매개변수 : 학생정보 => Std s
	 * 리턴타입 : boolean
	 * 메소드명 : insert
	 */
	public boolean insert(Std s){
		/* 매개변수 s를 그대로 넣으면 list와 외부에서 s를 같이 쓴다
		 * s를 복사생성자를 이용하여 s의 값과 동일한 값을 가지는 tmp
		 * 객체를 하나 만든 후 해당 tmp를 리스트에 추가한다
		 */
		Std tmp = new Std(s);
		/* add()라는 메소드는 list에 tmp와 일치하는 정보가 없으면
		 * 해당 객체를 추가하고 true를 리턴하며 tmp에 일치하는 정보가
		 * 있으면 추가하지 않고 false를 리턴한다.(Set의 특징)
		 */
		return list.add(tmp);
	}
	/* 기능 : 학생정보가 주어지면 list에서 학생정보와 일치하는 학생이
	 *      있으면 해당 학생 정보를 반환하는 기능
	 * 매개변수 : 학생정보 Std s
	 * 리턴타입 : 학생정보 Std
	 * 메소드명 : search
	 */
	public Std search(Std s){
		Iterator<Std> it = list.iterator();
		while(it.hasNext()){
			Std tmp = (Std)it.next();
			/* list에서 꺼낸 tmp와 s를 같은지를 equals를 이용하여
			 * 비교한 후 같으면 꺼낸 tmp를 반환
			 */
			if(tmp.equals(s))
				return tmp;
		}
		/* 반복문이 종료될때까지 return이 안된것은 해당 정보와
		 * 일치하는 객체가 list에 없는 경우이기 때문에 null값을 리턴 
		 */
		return null;
	}
	
	/* 기능 : 학생정보가 주어지면 list에서 해당 학생의 정보를 삭제하는데
	 *      일치하는 학생정보가 없으면 실패를, 있으면 삭제를 해서
	 *      성공을 알려주는 기능
	 * 매개변수 : 학생정보 Std s
	 * 리턴타입 : 실패 또는 성공 boolean
	 * 메소드명 : delete
	 */
	public boolean delete(Std s){
		Std tmp = search(s);
		/* search()를 통해 검색했을 때 일치하는 정보가 있으면 객체 정보를
		 * 없으면 null을 전달한다.
		 * remove()는 tmp라는 객체와 일치하는 정보가 있으면 해당 정보를
		 * 삭제한후 true의 값을 리턴하고, 없으면 false값을 리턴한다.
		 */
		return list.remove(tmp);
	}
	/* 기능 : 학생정보가 주어지면 기존 학생 정보를 수정하고 수정여부를
	 *      알려주는 기능
	 * 매개변수 : 학생정보 Std s 
	 * 리턴타입 : 수정 여부 boolean
	 * 메소드명 : update
	 */
	public boolean update(Std s){
		/* set에서 수정을 하려면 기존에 있는 객체를 삭제 후 
		 * 수정된 객체정보를 추가해야한다.
		 */
		if(!delete(s))
			return false;
		
		return insert(s);
	}
	
	/* 기능 : 전체 학생 정보를 출력하는 기능
	 * 매개변수 : 없다 
	 * 리턴타입 : 없다 => void
	 * 메소드명 : print
	 */
	public void print(){
		Iterator<Std> it = list.iterator();
		while(it.hasNext()){
			Std tmp = (Std)it.next();
			System.out.println(tmp);
		}
	}
	/* 기능 : 메뉴를 출력하는 기능
	 * */
	public void printMenu(){
		System.out.println("------메뉴------");
		System.out.println("1.학생정보 추가");
		System.out.println("2.학생정보 수정");
		System.out.println("3.학생정보 삭제");
		System.out.println("4.학생정보 출력");
		System.out.println("5.종료");
		System.out.println("---------------");
		System.out.print("메뉴를 입력해주세요 : ");
	}
	/* 기능 : Scanner가 주어지면 Scanner를 통해 학생 학번을 
	 *      입력받아 학생 객체로 돌려주는 기능
	 * 매개변수 : Scanner scan
	 * 리턴타입 : 학생 객체 Std
	 * 메소드명 : inputId
	 */
	public Std inputId(Scanner scan){
		System.out.println("----정보를 입력하세요----");
		System.out.print("학번 : ");
		String id = scan.next().trim();
		Std tmp = new Std();
		tmp.setId(id);
		return tmp;
	}
	public Std inputStd(Scanner scan){
		Std tmp = inputId(scan);
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("학교이름 : ");
		String sName = scan.next();
		System.out.print("전공 : ");
		String major = scan.next();
		System.out.print("평점 : ");
		double avr = scan.nextDouble();
		System.out.println("-------------------");
		tmp.setName(name);
		tmp.setSname(sName);
		tmp.setMajor(major);
		tmp.setAvr(avr);
		return tmp;
	}
}



