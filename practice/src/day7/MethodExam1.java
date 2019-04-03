package day7;

public class MethodExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[5];
		printArr(arr);
		initArr(arr,1);
		printArr(arr);
	}
	/* 기능 : 배열을 num로 초기화 하는 메소드
	 * 매개변수 : 배열, num => int[] arr, int num
	 * 리턴타입 : 없다=> void
	 * 메소드명 : initArr
	 * */
	public static void initArr(int[] arr, int num){
		arr = new int[10];
		for(int i = 0; i<arr.length; i++){
			arr[i] = num;
		}
	}
	public static void printArr(int[]arr){
		for(int tmp:arr){
			System.out.print(tmp + " ");
		}
		System.out.println();
	}

}
