package day7;

public class Test02 {
	public static void main(String[] args) {
		//2. 5개짜리 배열을 생성하고 배열에 0번지에 5, 1번지에 4, 2번지에 3, 3번지에
		//   2, 4번지에 1를 저장하고 출력하는 코드를 작성하세요.
		int []arr = new int[5];
		arr[0] = 5; arr[1] = 4; arr[2] = 3; arr[3] = 2; arr[4] = 1;
		for(int tmp:arr)
			System.out.print(tmp + " ");
		System.out.println();
		
		int []arr2 = new int[]{5,4,3,2,1};
		for(int i =0; i<arr2.length; i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
		
		int []arr3 = new int[5];
		for(int i=0; i<arr3.length; i++){
			arr3[i] = arr3.length - i;
		}
		for(int tmp:arr3)
			System.out.print(tmp + " ");
		System.out.println();
			
		
	}
}


