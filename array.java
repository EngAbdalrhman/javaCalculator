package Calculator;

import java.util.Scanner;

public class array {
	static Scanner input = new Scanner(System.in);

	public static void arrsum (int size, int size2) 
	{
		int[][] array1 = new int[size][size2];
		int[][] array2 = new int[size][size2];
		
		int[][] result = new int[size][size2];
		fillArray(array1, 1);
		fillArray(array2, 2);		

		for (int row = 0; row < result.length; row++)
		{
			for (int coulmns = 0; coulmns < result[0].length; coulmns++)
			{
				result[row][coulmns] = array1[row][coulmns] + array2[row][coulmns];
			}
		}
		
		//printing
		printing(result);

	}//sum Arrays
	public static void arrsub (int size, int size2) 
	{
		int[][] array1 = new int[size][size2];
		int[][] array2 = new int[size][size2];
		
		int[][] result = new int[size][size2];
		fillArray(array1, 1);		
		fillArray(array2, 2);		

		for (int row = 0; row < result.length; row++)
		{
			for (int coulmns = 0; coulmns < result[0].length; coulmns++)
			{
				result[row][coulmns] = array1[row][coulmns] - array2[row][coulmns];
			}
		}
		
		//printing
		printing(result);

	}//Subtract Arrays
	public static void arrmulti (int size1 , int size2 , int size3, int size4) 
	{
		int[][] array1 = new int[size1][size2];
		int[][] array2 = new int[size3][size4];
		
		int[][] result = new int[size1][size4];
		if (size2 == size3)
		{
			fillArray(array1, 1);		
			fillArray(array2, 2);		
			
			for (int rows = 0; rows < result.length; rows++)
			{
				for (int coulmns = 0; coulmns < result[0].length; coulmns++)
				{
					result[rows][coulmns] = 0; 
					for (int e = 0; e < array2.length; e++) //array1[0]
					{
						result[rows][coulmns] += array1[rows][e] * array2[e][coulmns];
					}
				}
			}
			
			//printing
			printing(result);
	
		}
		else return;
		
		
	}//Multiply Arrays
	// TODO
	static void printing(int[][] result) 
	{
		System.out.println("-------------------------------------");

		for (int i = 0; i < result.length; i++)
		{
			for (int j = 0; j < result[0].length; j++) 
			{
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
	}
	
	static void fillArray(int[][] array , int num) 
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[0].length; j++) 
			{
				System.out.println("Enter the element row no."+ (i+1)+" col no." + (j+1)+" of Array" + num);
				array[i][j] = input.nextInt();
			}
		}
	}

}
