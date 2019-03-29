package day1;

public class Exam5 {
	/*지금까지 먹은 밥값을 계산하여 결과를 출력하세요.
	단 하루에 3끼만 꼭 먹고 한끼에 3000원이다. 개월은 무시하고
	나이로만 계산, 윤년은 무시*/
	public static void main(String[] args) {
		int age = 25;
		int day = 3;
		int money = 3000;
		int year = 365;
		int totalMoney = age * day * money * year;
		
		System.out.println("지금까지 먹은 금액 : " + totalMoney + "원");
	}

}
