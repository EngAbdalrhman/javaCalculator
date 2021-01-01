package Calculator;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) 
{
	Scanner input =new Scanner(System.in);
	int n = 0;
	double result;
	do
	{
		System.out.println("Welcome to Speedy's calc.");
		System.out.println("This is the Menu of operations Enter the number as following.");
		System.out.println("1. Sum");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Dividing");
		System.out.println("5. Sum of Arrays");
		System.out.println("6. Sub of Arrays");
		System.out.println("7. Multiply of Arrays");
		System.out.println("8. X^2 Solve");
		System.out.println("9. Exponent");
		System.out.println("10. Factorial");
		System.out.println("11. Moudels");
		System.out.println("0. Exit");
		n = input.nextInt();
		switch(n) 
		{
		case 0:
		{
			System.out.println("Thank you.");
			break;
		}
		case 1:
		{
			System.out.println("Enter First num");
			double fnum = input.nextDouble();
			System.out.println("Enter Secound num");
			double snum = input.nextDouble();
			result = sum(fnum, snum);
			System.out.println("Result = "+ result);
			break;
		}
		case 2:
		{
			System.out.println("Enter First num");
			double fnum = input.nextDouble();
			System.out.println("Enter Secound num");
			double snum = input.nextDouble();
			result = sub(fnum, snum); 
			System.out.println("Result = "+ result);
			break;
		}
		case 3:
		{
			System.out.println("Enter First num");
			double fnum = input.nextDouble();
			System.out.println("Enter Secound num");
			double snum = input.nextDouble();
			result = multi(fnum, snum); 
			System.out.println("Result = "+ result);
			break;
		}
		case 4:
		{
			System.out.println("Enter First num");
			double fnum = input.nextDouble();
			System.out.println("Enter Secound num");
			double snum = input.nextDouble();
			result = div(fnum, snum); 
			System.out.println("Result = "+ result);
			break;
		}
		case 5:
		{
			int[] size = new int[2];
			for (int i = 0; i < size.length; i++)
			{
				System.out.println("Enter size " + (i+1));
				size[i] = input.nextInt();
			}
			array.arrsum(size[0] , size[1]);
			break;
		}
		case 6:
		{
			int[] size = new int[2];
			for (int i = 0; i < size.length; i++)
			{
				System.out.println("Enter size " + (i+1));
				size[i] = input.nextInt();
			}
			array.arrsub(size[0] , size[1]);
			break;
		}
		case 7: 
		{
			int[] size = new int[4];
			for (int i = 0; i < size.length; i++)
			{
				System.out.println("Enter size " + (i+1));
				size[i] = input.nextInt();
			}
			array.arrmulti(size[0], size[1], size[2], size[3]);
			
			break;
		}
		case 8:
		{
			System.out.println("enter first num");
			double fnum= input.nextDouble();
			System.out.println("enter secound num");
			double snum= input.nextDouble();
			System.out.println("enter third num");
			double thnum= input.nextDouble();
			sqrt(fnum, snum,thnum); 
			break;
		}
		case 9:
		{
			System.out.println("Enter Base");
			double fnum= input.nextDouble();
			System.out.println("Enter Exponent");
			double snum= input.nextDouble();
			Exponent (fnum, snum);
			break;
		}
		case 10:
		{
			System.out.println("enter first num");
			double fnum= input.nextDouble();
			Factorial (fnum);
			break;
		}
		case 11:
		{
			System.out.println("enter first num");
			double fnum= input.nextDouble();
			System.out.println("enter secound num");
			double snum= input.nextDouble();
			Moudels (fnum, snum);
			break;
		}
		default:System.out.println("Enter correct number");
		
		}
		
		

	}//end do
	while(n != 0);
	}//end main
	public static double sum (double x, double y) 
	{
		
		return x + y;
	}//sum
		
	public static double sub (double x, double y) 
	{
		return x - y;
	}//Subtract
		
	public static double multi (double x, double y) 
	{
		return x * y;
	}//Multiply
		
	public static double div (double x, double y) 
	{
		return x / y;
	}//Dividing
	public static void sqrt (double a, double b, double c)
	{
		double x1=(-b+Math.sqrt( Math.pow(b,2)-4*a*c))/(2*a);
		double x2=(-b-Math.sqrt( Math.pow(b,2)-4*a*c))/(2*a);
		System.out.println("first root is "+x1);
		System.out.println("secound root is "+x2);
	}

	public static void Exponent (double x, double y) 
	{
		double result;
		result = Math.pow(x,y);
		System.out.println(result);
	}//Exponent
	public static void Factorial (double x) 
	{
		double result = 1;
		for (double i = x; i > 0; i--) 
		{
			result = result * i;
		}
		System.out.println(result);
	}//Factorial
	public static void Moudels (double x, double y) 
	{
		double result;
		result =x % y;
		System.out.println(result);
	}//Moudels
}//end class

