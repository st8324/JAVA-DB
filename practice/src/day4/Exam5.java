package day4;

public class Exam5 {

	public static void main(String[] args) {
		/*
		*********	i=1 공=0 *=9	5=>6-1
		 *******	i=2 공=1 *=7 4
		  *****		i=3 공=2 *=5 3
		   ***		i=4 공=3 *=3 2
		    *		i=5 공=4 *=1 1
					       공=i-1 *=2*(5+1-i)-1
		 */
		int num = 5;
		int i,j;
		for(i=1; i<=num; i++){
			for(j=1 ;j<=i-1 ;j++){
				System.out.print(" ");
			}
			for(j=1 ;j<=2*(num-i)+1 ;j++ ){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		*********	i=5 공=0 *=9	5=>6-1
		 *******	i=4 공=1 *=7 4
		  *****		i=3 공=2 *=5 3
		   ***		i=2 공=3 *=3 2
		    *		i=1 공=4 *=1 1
					       공=num-i *=2*i-1
		 */
		num=5;
		for(i=num; i>=1;i--){
			for(j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
