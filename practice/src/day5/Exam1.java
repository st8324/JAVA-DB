package day5;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for(i=1; ; i++){
			if(i>3){
				break;
			}
			for(j=1; ; j++){
				if(j>5){
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
