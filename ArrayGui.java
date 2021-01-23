package Calculator;

import java.util.Scanner;

public class ArrayGui {

	public  void operationsArray (int[][] array1, int[][] array2, int op) 
	{
		int size = array1.length;
		int size2 = array1[0].length;

		int[][] result = new int[size][size2];
	

		for (int row = 0; row < result.length; row++)
		{
			for (int coulmns = 0; coulmns < result[0].length; coulmns++)
			{
				switch(op) {
					case 1: result[row][coulmns] = array1[row][coulmns] + array2[row][coulmns];
					break;
					case 2: result[row][coulmns] = array1[row][coulmns] - array2[row][coulmns];
					break;
				}
				
			}
		}
		
		//printing
		Printing pr = new Printing(size , size2 , result);
		pr.setVisible(true);

		
	}//Operation Arrays
	
	public  void multiplyArrays (int[][] array1, int[][] array2) 
	{
		int size1 = array1.length;
		int size2 = array1[0].length;
		int size3 = array2.length;
		int size4 = array2[0].length;
		
		int[][] result = new int[size1][size4];
		if (size2 == size3)
		{	
			
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
			Printing pr = new Printing(size1 , size4 , result);
			pr.setVisible(true);
		}
		
	}//Multiply Arrays
	
}
