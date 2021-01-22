package Calculator;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) 
{
	MathOperators math = new MathOperators();
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
		System.out.println("12. Prime Search");
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
			result = math.sum(fnum, snum);
			System.out.println("Result = "+ result);
			break;
		}
		case 2:
		{
			System.out.println("Enter First num");
			double fnum = input.nextDouble();
			System.out.println("Enter Secound num");
			double snum = input.nextDouble();
			result = math.sub(fnum, snum); 
			System.out.println("Result = "+ result);
			break;
		}
		case 3:
		{
			System.out.println("Enter First num");
			double fnum = input.nextDouble();
			System.out.println("Enter Secound num");
			double snum = input.nextDouble();
			result = math.multi(fnum, snum); 
			System.out.println("Result = "+ result);
			break;
		}
		case 4:
		{
			System.out.println("Enter First num");
			double fnum = input.nextDouble();
			System.out.println("Enter Secound num");
			double snum = input.nextDouble();
			result = math.div(fnum, snum); 
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
			ArraysOperations.arrsum(size[0] , size[1]);
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
			ArraysOperations.arrsub(size[0] , size[1]);
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
			ArraysOperations.arrmulti(size[0], size[1], size[2], size[3]);
			
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
			math.sqrt(fnum, snum,thnum); 
			break;
		}
		case 9:
		{
			System.out.println("Enter Base");
			double fnum= input.nextDouble();
			System.out.println("Enter Exponent");
			double snum= input.nextDouble();
			int results = math.Exponent (fnum, snum);
			System.out.println(results);
			break;
		}
		case 10:
		{
			System.out.println("enter first num");
			int fnum= input.nextInt();
			int x = math.Factorial (fnum);
			System.out.println(x);
			break;
		}
		case 11:
		{
			System.out.println("enter first num");
			double fnum= input.nextDouble();
			System.out.println("enter secound num");
			double snum= input.nextDouble();
			math.Moudels (fnum, snum);
			break;
		}
		case 12:
		{
			System.out.println("Enter the num");
			int num = input.nextInt();
			boolean con = math.isPrime(num); 
			if(con)
				System.out.println("the number is prime");
			else	
				System.out.println("the number isn't prime");
			
			break;
		}
		default:System.out.println("Enter correct number");
		}
		
		

	}//end do
	while(n != 0);
	}//end main
	
}//end class

