
public class Demo 
{
	public static void main(String[] args) 
	{
			Demo.OneDimensionalArray();

			Demo.TwoDimensionalArray();
		
	}
	
	
	/**
	 * Some basic implementations of 1D array
	 */
	public static void OneDimensionalArray()
	{
		System.out.println("---------------------------- One Dimensional Array ----------------------------");
		int []nums = new int[4]; // you should specify the number of elements in this array
		nums[0] = 8;
		nums[1] = 12;
		nums[2] = 76;
		nums[3] = 54;
		
		//int []nums = {8,12,76,54}; // if you already know the values you can also assign like this
		
		System.out.println("Displaying 1D array values using for loop:-");
		for (int i = 0; i <= 3; i++) 
		{
			System.out.println(nums[i]);
		}
		
		System.out.println("");
		
		System.out.println("Displaying array values using enhanced for loop");
		for (int i : nums) {
			System.out.println(i);
		}
	}
	
	
	public static void TwoDimensionalArray()
	{
		System.out.println("---------------------------- Two Dimensional Array ----------------------------");
		int a[] = {1,2,3,4};
		int b[] = {2,4,6,8};
		int c[] = {5,6,7,8};
		
		int d[][] = {	
						{1,2,3,4},
						{2,4,6,8},
						{5,6,7,8}
					};
		
		
		System.out.println("Printing a single element from 2D array d[0][1] = "+ d[0][1]);
		System.out.println("");
		
		System.out.println("Printing all the elements of 2D array using for loop");
		for (int row = 0; row <=2; row++) 
		{
			for (int col = 0; col <=3; col++) 
			{
				System.out.print(d[row][col] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		
		System.out.println("---------------------------- Two Dimensional Jagged Array ----------------------------");
		
		int h[][] = {	
						{1,2,3,4},
						{2,4,6},
						{5,6,7,8,9,10}
					};
		System.out.println("Printing a single element from 2D jagged array d[0][1] = "+ h[0][1]);
		System.out.println("");
		
		
		System.out.println("Printing all the elements of 2D jagged array using for loop");
		for (int row = 0; row <h.length; row++) 
		{
			for (int col = 0; col <h[row].length; col++) 
			{
				System.out.print(h[row][col] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
