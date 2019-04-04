package day8;
/* 접근제한자 - public
 * 클래스에 public을 붙일 수 있는 경우는 단 하나다.
 * 클래스명과 파일명이 일치하는 경우에만 public을 붙일 수 있다.
 * 
 * 접근제한자 - default
 * 접근제한자 default는 defualt라는 키워드를 쓴 것이 아니라 클래스나 메소드에
 * 접근제한자를 명시하지않은 경우를 default라 한다.
 * default는 같은 패키지안에서만 접근 가능하다.
 * 
 * 접근제한자 - private
 * 일반적으로 멤버 메소드나 멤버 변수에 붙이고
 * 자신(해당 멤버 메소드를 포함하는 클래스)을 제외한 다른 클래스에서 사용할 수 없다.
 * */
public class ClassExam1 {

	public static void main(String[] args) {
		Tv t = null;
		t = new Tv();//Tv()라는 생성자를 호출해서 객체를 생성
		t.printVolumn();
		t.volumnDown();
		t.printVolumn();
	}
}
class Tv{
	//일반적으로 멤버 변수는 접근제한자를 private로 설정하여
	//멤버 변수를 직접 수정할 수 없게 하고, 멤버 메소드를 통해 수정하도록 한다.
	//멤버 변수 : 부품, 요소
	private int channel;
	private int volumn;
	private final int MAX_CHANNEL = 100;
	private final int MAX_VOLUMN = 100;
	//멤버 메소드 : 기능
	//일반적으로 멤버 메소드는 접근제한자를 public로 많이한다.
	/* 기능 : 멤버변수 volumn의 크기를 하나 증가하는 메소드
	 * 매개변수 : 없다=>void(써도 되고 안써도된다.)
	 * 리턴타입 : 없다=>void
	 * 메소드명 : volumnUp
	 */
	public void volumnUp(){
		if(MAX_VOLUMN > volumn)
			volumn++;	
	}
	public void volumnDown(){
		if(volumn > 0)
			volumn--;	
	}
	public void printVolumn(){
		System.out.println(volumn);
	}
	public void channelUp(){
		if(channel < MAX_CHANNEL)
			channel++;
	}
	public void channelDown(){
		if(channel > 0)
			channel--;
	}
	public void setChannel(int ch){
		channel = ch;
	}
}






