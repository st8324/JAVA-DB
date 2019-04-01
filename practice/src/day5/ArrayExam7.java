package day5;

public class ArrayExam7 {
	public static void main(String[] args) {
		//a~z,A~Z,0~9로 조합된 8자리의 임시 비밀번호 발급하는 예제
		//a~z : 26개, A~Z : 26개, 0~9 : 10개
		//62개, 0~61
		//0~9 : '0'~'9'
		//10~35 : 'a'~'z'
		//36~61 : 'A'~'Z'
		//랜덤한 수가 60 : 'Y'
		char []pw = new char[8];
		for(int i=0; i<pw.length; i++){
			int r= (int)(Math.random()*62);
			if(r<=9){
				//문자 + 정수 = 정수
				//문자 = 정수;//(불가능)
				//문자 = (char)정수;//(가능)
				pw[i] = (char)('0'+r);
			}else if(r<= 35){
				pw[i] = (char)('a'+(r-10));
			}else{
				pw[i] = (char)('A'+(r-36));
			}
		}
		System.out.println(pw);
	}
}
