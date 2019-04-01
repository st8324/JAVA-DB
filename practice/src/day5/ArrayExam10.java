package day5;

public class ArrayExam10 {

	public static void main(String[] args) {
		/* 향상된 for문
		 * 1. 배열의 모든 값들을 확인한다
		 * 2. 배열의 값을 수정할때에는 사용 불가
		 * for(자료형 변수명:배열이름){
		 * 		실행문;
		 * }
		 * 자료형은 배열과 같은 자료형을 써야 한다
		*/
		int []num = new int[]{1,2,3,4,5};
		boolean find =false;
		int search = 6;
		for(int tmp :num ){
			if(tmp == search){
				find = true;
				break;
			}
		}
		if(find){
			System.out.println("있음");
		}else{
			System.out.println("없음");
		}
	}

}
