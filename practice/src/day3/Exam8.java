package day3;

public class Exam8 {

	public static void main(String[] args) {
		/*
		******
		******
		******
		******
		******
		******
		*/
		int i = 0, j = 0;
		for(i=1; i<=6; i++){
			for(j=1; j<=6; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		*
		**
		***
		****
		*****
		******
		*/
		for(i=1; i<=6; i++){
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		     * i=1 공=5 *=1
		    ** i=2 공=4 *=2
		   *** i=3 공=3 *=3
		  **** i=4 공=2 *=4
		 ***** i=5 공=1 *=5
		****** i=6 공=0 *=6
		                    공=6-i *=i
		*/
		for(i=1; i<=6; i++){
			for(j=1; j<=6-i; j++){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		     * 		i=1 공=5 *=1
		    *** 	i=2 공=4 *=3
		   ***** 	i=3 공=3 *=5
		  ******* 	i=4 공=2 *=7
		 ********* 	i=5 공=1 *=9
		***********	i=6 공=0 *=11
		                             공=6-i *=2*i-1  
		*/
		for(i=1; i<=6; i++){
			for(j=1; j<=6-i; j++){
				System.out.print(" ");
			}
			for(j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		     * 			i=1 추*=0
		    ** * 		i=2 추*=1
		   *** ** 		i=3 추*=2
		  **** *** 		i=4 추*=3
		 ***** **** 	i=5 추*=4
		****** *****	i=6 추*=5
		                                     추*=i-1           
		*/
		for(i=1; i<=6; i++){
			for(j=1; j<=6-i; j++){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			for(j=1; j<=i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		******	i=1 *=6
		*****	i=2 *=5
		****	i=3 *=4
		***		i=4 *=3
		**		i=5 *=2
		*		i=6 *=1
		            *=7-i=6+1-i=num+1-i
		*/
		int num = 6;
		for(i=1; i<=num; i++){
			for(j=1; j<=num+1-i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		****** i=1 공=0 *=6
		 ***** i=2 공=1 *=5
		  **** i=3 공=2 *=4
		   *** i=4 공=3 *=3
		    ** i=5 공=4 *=2
		     * i=6 공=5 *=1
				   공=i-1 *=7-i=6+1-i=num+1-i
	     */
		for(i=1; i<=num; i++){
			for(j=1; j<=i-1; j++){
				System.out.print(" ");
			}
			for(j=1; j<=num+1-i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}







