package day13;

public class ForExam2 {

	public static void main(String[] args) {
		// 1. 다음 배열의 모든 값을 출력하는 코드를 작성하세요.
		int arr[] = new int[]{1,3,5,7,9,2,4,6,8};
		/* 향상된 for문 사용 조건
		 * 1. 배열이나 컬렉션프레임워크 일 때 사용
		 * 2. 배열의 값을 확인할 때 사용
		 * 3. 배열의 값을 수정할때는 사용하지 않음
		 * 4. 모든 배열을 확인하면서 번지를 신경안쓸데
		 * */
		for(int tmp : arr){
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		for(int i = 0; i<arr.length; i++){
			int tmp = arr[i];
			System.out.print(tmp + " ");
		}
		System.out.println();
		// 2. 위의 배열에서 짝수번지에 있는 값을 출력하세요.
		for(int i = 0; i<arr.length; i+=2){
			int tmp = arr[i];
			System.out.print(tmp + " ");
		}
		System.out.println();
		// 3. 위의 배열에서 가장 큰 수를 출력하세요.
		//1 3 5 7 9 2 4 6 8
		int max = arr[0];
		for(int tmp:arr){
			if(max < tmp){
				max = tmp;
			}
		}
		System.out.println("배열의 최댓값 : " + max);
	}
}




