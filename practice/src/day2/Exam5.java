package day2;

public class Exam5 {

	//num가 0이면 0이라고 출력하고, 1이면 1이라고 출력하고
	//0과 1이 아니면 0과 1이 아닙니다라고 출력하는 예제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		//num가 0이면
		//=> num가 0과 같다면
		if(num == 0){
			System.out.println("0입니다.");
		}else if(num == 1){
			System.out.println("1입니다.");
		}else{//if(num!=0 && num != 1)
			System.out.println("0과 1이 아닙니다.");
		}
	}

}
