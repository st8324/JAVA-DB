package day9;

public class SamsungTv {
	//일반 멤버 변수,객체 멤버 변수
	private int channel;
	private int volumn;
	private final int MAX_CHANNEL = 500;
	private final int MAX_VOLUMN = 100;
	
	//클래스 멤버 변수
	public static final String BRAND="삼성";
	
	//일반 멤버 메소드, 객체 멤버 메소드
	public void channelUp(){
		if(channel < MAX_CHANNEL)
			channel++;
	}
	public void channelDown(){
		if(channel>1)
			channel--;
	}
	public void setChannel(int ch){
		if(ch == 0)
			channel = 1;
		else if(ch > MAX_CHANNEL)
			channel = MAX_CHANNEL;
		else 
			channel = ch;
	}
	public void volumnUp(){
		if(MAX_VOLUMN > volumn)
			volumn++;
	}
	public void volumnDown(){
		if(volumn > 0)
			volumn--;
	}
	public void printVolumn(){
		System.out.println("현재 소리 크기 : "+volumn);
	}
	public void printChannel(){
		System.out.println("현재 채널 번호 : " + channel);
		//객체 멤버 메소드에는 클래스 멤버 변수 또는 클래스 멤버 메소드를 사용할
		//수 있다
		//System.out.println(BRAND);
	}
	public static void printBrand(){
		System.out.println("Tv 브랜드 : " + BRAND);
		//클래스 멤버 메소드에는 클래스 멤버 변수는 사용 가능하지만
		//객체 멤버 변수는 사용할 수 없다.
		//System.out.println(channel);
	}
	//멤버 메소드는 원하는 시점에서 호출이 가능하지만
	//생성자는 객체를 생성할 때에만 호출한다.
	//객체 멤버 변수를 초기화
	//생성자가 없을 때 기본생성자가 컴파일러에 의해 자동으로 추가된다.
	//기본 생성자 없이 다른 생성자를 만들고 기본생성자를 호출하면 에러가 난다.
	public SamsungTv() {
		this(1, 10);
	}
	public SamsungTv(int channel, int volumn){
		setChannel(channel);
		if(volumn>MAX_VOLUMN)
			this.volumn = MAX_VOLUMN;
		else
			this.volumn = volumn;
	}
	//복사 생성자
	public SamsungTv(SamsungTv stv){
		this(stv.channel, stv.volumn);
		/*channel = stv.channel;
		volumn = stv.volumn;*/
	}
}
