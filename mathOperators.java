package Calculator;

public class mathOperators {
	public double sum (double x, double y) 
	{
		
		return x + y;
	}//sum
		
	public double sub (double x, double y) 
	{
		return x - y;
	}//Subtract
		
	public  double multi (double x, double y) 
	{
		return x * y;
	}//Multiply
		
	public  double div (double x, double y) 
	{
		return x / y;
	}//Dividing
	public double[] sqrt (double a, double b, double c)
	{
		double x1=(-b+Math.sqrt( Math.pow(b,2)-4*a*c))/(2*a);
		double x2=(-b-Math.sqrt( Math.pow(b,2)-4*a*c))/(2*a);
		double x[] = new double[2];
		x[0] = x1;
		x[1] = x2;
		
		return x;
		//System.out.println("first root is "+x1);
		//System.out.println("secound root is "+x2);
	}

	public  int Exponent (double x, double y) 
	{
		double result;
		//result = Math.pow(x,y);
		// for loop
		int pow =1;
		for(int i =0;i<y;i++)
		{
		pow *= x;
		}
		return pow;
		//System.out.println(result);
	}//Exponent
	public  int Factorial (int x) 
	{
		int result = 1;
		for (int i = x; i > 0; i--) 
		{
			result = result * i;
		}
		return result;
	}//Factorial
	public static void Moudels (double x, double y) 
	{
		double result;
		result =x % y;
		System.out.println(result);
	}//Modulus
	static boolean isPrime(int num) 
	 {

		   if(num == 1) 
	    	{
				return true;
			}
			else 
			{
				for (int i = 2; i < num; i++) 
				{
					if((num % i) == 0) 
					{
						return false;
					}
				}
				return true;

			}
	 }
}

// WHEN to use static