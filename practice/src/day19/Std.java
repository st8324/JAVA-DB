package day19;
/*
학생 클래스
1. 멤버 변수
2. 멤버 변수에 대한 getter와 setter
3. toString() 오버라이딩
    => 객체 정보를 문자열로 쉽게 보기 위해
4. hashCode(), equals() 오버라이딩
    => 학생 매니저에서 set을 이용하여 학생 정보를 
         관리하는데 set은 중복을 허용하지 않고 중복
         확인을 hashCode()와 equals()를 이용하여 검사
         하는데 기본적으로 구현되어 있지 않으면 부모
         것을 가져오기 때문에 id를 이용하여 같은지 다를지
         를 판변하기 위해 오버라이딩
5. 생성자
 */
public class Std {
	/*
	 * String 객체 멤버는 기본값이 null이기 때문에
	 * "" 빈문자열로 명시적 초기화를 한다.
	 * 초기화 순서
	 * 기본값 > 명시적 초기화 > 초기화 블록 > 생성자	
	 * 접근제한자가 private이기 때문에 외부에서 접근이 불가
	 * getter와 setter가 필요하다
	*/
	private String name="";	//이름
	private String Sname="";//학교이름
	private String id="";		//학번
	private String major="";//전공
	private double avr;			//평점
	
	public String getName() {
		return name;
	}
	public String getSname() {
		return Sname;
	}
	public String getId() {
		return id;
	}
	public String getMajor() {
		return major;
	}
	public double getAvr() {
		return avr;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setAvr(double avr) {
		//평점은 0에서 4.5사이이기 때문에 범위를 벗어나느
		//점수가 들어온다면 저장하지 않는다
		if(avr > 4.5 || avr < 0)
			return;
		this.avr = avr;
	}
	//학생 정보를 객체를 이용하여 출력할 때 보고 싶은 내용으로
	//출력하기 위해 오버라이딩을 함
	@Override
	public String toString() {
		return "학생 [이름 : " + name + ", 학교이름 : " 
				+ Sname + ", 학번 : " + id + ", 전공 : " 
				+ major + ", 평점 : " + avr + "]";
	}
	//그룹 == 분류
	//id가 같으면 같은 그룹에 있게하기 위해서
	//hashCode()와 equals()는 항상 세트로 오버라이딩을 해야함
	//같다는 것을 판별하가 위한 정보들이 있는데 이 정보들이 같은데
	//다른 그룹이면 다른 객체로 판별하게 된다. 따라서 같은 객체로
	//판별하기 위해서는 같은 정보를 가지면 같은 그룹에 있게해야한다.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Std other = (Std) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	//기본 생성자는 생성자가 하나도 없으면 자동으로 생성되지만
	//다른 생성자가 있으면 자동으로 생성되지 않는다.
	//사실 이 클래스에서 기본 생성자에서 할 일은 없다
	// ==> 명시적 초기화에서 다 했기 때문에
	//다른 생성자를 만들거고 혹시나 기본 생성자를 이용해서
	//객체를 만들 상황이 있을 수도 있기 때문에 간단히 만들어줬다
	public Std(){}
	//복사 생성자 : 매개변수가 같은 클래스의 객체가 넘어오는 경우
	//오버로딩 : 한 클래스 내에서 동일한 이름을 가지는 
	//        메서드(생성자)가 여러개 존재하는 경우
	//1. 매개변수의 갯수가 다르다.
	//2. 자료형이 다르다.
	//생성자 특징
	//1. 클래스명과 동일하다
	//2. 리턴타입이 없다.
	//3. 마음대로 호출할 수 없고 객체가 생성될 때(new) 호출된다.
	public Std(Std s){
		//this() : 내 생성자를 호출
		//복사 생성자는 아래에서 구현한 생성자 오버로딩을 호출
		//하여 코드의 중복을 제거함
		this(s.name, s.id, s.Sname, s.major, s.avr);
	}
	//생성자 오버로딩
	public Std(String name,String id,String sName,
			String major, double avr){
		//this : 나
		this.name = name;
		this.id = id;
		this.Sname = sName;
		this.major = major;
		this.avr = avr;
	}
	
}






