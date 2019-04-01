package day5;

public class ArrayExam3 {

	public static void main(String[] args) {
		/*	7개를 저장할 수 있는 정수형 배열을 생성하고
		 *  각 번지에 1~45사이의 랜덤한 수를 생성하여 저장하는
		 *  코드를 작성하세요.
		 * */
		int [] arr;
		arr = new int[7];
		int i = 0;
		//int r = (int)(Math.random()*(45-1+1))+1;
		for(i=0; i<arr.length; i++){
			//arr[i] = (int)(Math.random()*(45-1+1))+1;
			int r = (int)(Math.random()*(45-1+1))+1;
			arr[i] = r;
			System.out.println(arr[i]);
		}
	}
}
