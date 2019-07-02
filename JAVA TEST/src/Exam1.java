
public class Exam1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum1();
		sum2(10,100);
		sum2(100,10);
		System.out.println(sum3(1,10)*2);
	}
	public static void sum1(){
		int res = 0;
		for(int i=1; i<= 10; i++)	res += i;
		System.out.println(res);
	}
	public static void sum2(int min, int max){
		int res = 0;
		for(int i=min; i<= max; i++)	res += i;
		System.out.println(res);
	}
	public static int sum3(int min, int max){
		int res = 0;
		for(int i=min; i<= max; i++)	res += i;
		return res;
	}
	
}
