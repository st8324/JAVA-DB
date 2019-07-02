
public class Test4 {
	/* 클래스 멤버 메소드안에 있는 메소드들은 다른 클래스의 객체/클래스 메소드이거나
	 * 같은 클래스의 클래스 메소드를 사용할 수 있다. 같은 클래스의 객체 메소드도 
	 * 객체를 생성하면 사용할 수 있다.
	 * */
	public static void main(String[] args) {
		// 4. 산술연산하는 메소드를 생성하여 테스트하는 코드를 작성하세요.
		int num1 = 1, num2 = 3;
		char op = '/';
		double res = 0.0;
		try{
			res = cal(num1, num2, op);
			System.out.println(num1+""+op+num2+"="+res);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public static double cal(int num1, int num2, char op) 
			throws Exception{
		double res = 0.0;
		switch(op){
		case '+':	res = num1 + num2; break;
		case '-':	res = num1 - num2; break;
		case '*':	res = num1 * num2; break;
		case '/':	
			if(num2 == 0) 
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			res = (double)num1 / num2; 
			break;
		case '%':
			if(num2 == 0) 
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			res = num1 % num2; 
			break;
		default:
			throw new Exception("잘못된 연산자입니다.");
		}
		return res;
	}

}
