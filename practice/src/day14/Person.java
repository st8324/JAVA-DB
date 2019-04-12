package day14;

public class Person {
	//이름, 나이, 생일, 성별, 주소, 국적
	private String name;
	private int age;
	private String birthDay;
	private String gender;
	private String address;
	private String nationality;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public String getGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	public String getNationality() {
		return nationality;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age >= 0)
			this.age = age;
	}
	public void setBirthDay(String birthDay) {
		if(birthDay == null || birthDay.length() != 8)
			return;
		//yyyyMMdd
		//substring : 부분 문자열 추출로 4번지와 5번지를 추출
		String sMonth = birthDay.substring(4,6);
		//문자열 12를 정수 12로 변경
		Integer month = Integer.parseInt(sMonth);
		if(month>=1 && month <=12)
			this.birthDay = birthDay;
	}
	public void setGender(String gender) throws Exception {
		if(gender == null)
			throw new Exception("객체가 null값 입니다.");
		if(gender != null && (gender.equals("남자")
				|| gender.equals("여자")))
			this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Person(){
	//이름, 나이, 생일, 성별, 주소, 국적
		this("","","","남자","20000101",1);
	}
	public Person(Person p){
		this(p.name, p.address, p.nationality, p.gender,
				p.birthDay, p.age);
	}
	
	public Person(String name, String address, String nationality
			,String gender, String birthDay, int age){
		this.name=name; this.address=address; 
		this.nationality=nationality; this.age=age;
		try {
			setGender(gender);
		} catch (Exception e) {
			this.gender="남자";
		}
		setBirthDay(birthDay);
	}
}
