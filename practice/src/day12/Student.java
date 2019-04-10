package day12;

public class Student{
	private String name;	//학생 이름
	private int grade;		//학생 학년
	private int classNum;	//학생 반
	private int num;		//학생 번호
	private double kor;
	private double eng;
	private double math;
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public int getNum() {
		return num;
	}
	public double getKor() {
		return kor;
	}
	public double getEng() {
		return eng;
	}
	public double getMath() {
		return math;
	}
	public void setName(String name) {
		//멤버변수 name에 매개변수 name을 저장해라
		//우선순위가 멤버변수보다 매개변수 또는 지역변수가 크기 때문에
		//아래 주석처리한 코드는 의미가 없어진다.
		//name = name;//매개변수 = 매개변수;
		//매개변수 또는 지역변수의 이름이 멤버 변수와 동일한 경우
		//멤버변수와 매개변수(지역변수)를 구분하기 위해 this.을 붙인다.
		//this : 나(현재 클래스)
		//. : 멤버 변수나 멤버 메소드를 호출하는 연산자로
		//    클래스나 객체명 다음에 온다
		if(name.length()<= 5)
			this.name = name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setKor(double kor) {
		if(kor>=0 && kor <= 100)
			this.kor = kor;
	}
	public void setEng(double eng) {
		if(eng>=0 && eng <= 100)
			this.eng = eng;
	}
	public void setMath(double math) {
		if(math>=0 && math <= 100)
			this.math = math;
	}
	//생성자 : 객체를 만들때(new 연산자를 호출한 시점) 멤버 변수를
	//       원하는 값으로 초기화를 하고 싶은때 생성자를 구현을 해준다.
	//생성자를 하나도 구현하지 않으면 기본 생성자가 자동으로 만들어진다.
	//단, 생성자가 하나라도 구현되어 있으면 기본 생성자가 자동으로
	//    만들어지지 않는다.
	public Student(){
		init();
	}
	public Student(String name, int grade, int classNum,
			int num, double kor, double eng, double math){
		init(name,grade,classNum, num,kor, eng, math);
		//init();
	}
	public Student(Student s){
		init(s.name, s.grade, s.classNum, s.num, s.kor,
				s.eng, s.math);
	}
	//멤버 변수를 초기화 하는 메소드
	public void init(){
		init("",1,1,1,0,0,0);
		//init(new String(),1,1,1,0,0,0);
	}
	public void init(String name, int grade, int classNum,
			int num, double kor, double eng, double math){
		this.setName(name);
		this.setGrade(grade);
		this.setClassNum(classNum);
		this.setNum(num);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 학년 : " + grade + ", 반 : " + classNum + ", 번호 : " + num + ", 국어성적 : " + kor
				+ ", 영어성적 : " + eng + ", 수학성적 : " + math;
	}
}
