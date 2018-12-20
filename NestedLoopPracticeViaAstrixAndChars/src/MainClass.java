/**
 * 
 * Reference : https://youtu.be/OQbwl4XTkKw?list=PLsyeobzWxl7pFZoGT1NbZJpywedeyzyaf 
 * @author a.asfaw
 */
public class MainClass {
	public static void main(String[] args) {

	/*
	  * * * *
	  * * * *  
	  * * * *
	  * * * *
	 */
		System.out.println("Example 1: ");
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}		
			
	/*
	  * * * *
	  * * *   
	  * * 
	  * 
	 */
		System.out.println("");
		System.out.println("Example 2:");
		for (int i = 4; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	
	/*
	  * 
	  * *  
	  * * *
	  * * * *
	*/
		System.out.println("");
		System.out.println("Example 3:");
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	/*
	  A 
	  A B
	  A B C
	  A B C D
	 */
		System.out.println("");
		System.out.println("Example 3:");
		for (int i = 65; i <=68; i++) {
			for (int j = 65; j <=i; j++) {
				System.out.print((char)j+" ");
			}
			System.out.println("");
		}
		
	/*
	  $ $ $ $ 
	  $     $
	  $     $
	  $ $ $ $
	 */
		System.out.println("");
		System.out.println("Example 4:");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <=4; j++) {
				if(i == 1 || i == 4)
					System.out.print("$ ");
				if((i==2 || i==3) && (j==2 || j==3))
					System.out.print("  ");
				if(((i==2 ||i==3) && (j==1 || j==4)))
					System.out.print("$ ");
			}
			System.out.println("");
		}
	}
}
