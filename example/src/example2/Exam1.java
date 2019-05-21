package example2;

public class Exam1 {
	public static void main(String [] args){
		double num1 = 1.23, num2 = 0;
		char op = '/';
		double res;
		
		try{
			res = calc(num1,num2,op);
			System.out.println(res);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	public static double calc(double num1, double num2, char op) 
			throws Exception{
		double res=0;
		switch(op){
		case '+':	res = num1 + num2; 	break;
		case '-':	res = num1 - num2; 	break;
		case '*':	res = num1 * num2; 	break;
		case '/':
			if(num2 == 0)	throw new Exception("0으로 나눌 수 없습니다.");
			res = num1 / num2; 	break;
		case '%':
			if(num2 == 0)	throw new Exception("0으로 나눌 수 없습니다.");
			res = num1 % num2; 	break;
		default:
			throw new Exception("잘못된 연산자입니다.");
		}
		return res;
	}
}
