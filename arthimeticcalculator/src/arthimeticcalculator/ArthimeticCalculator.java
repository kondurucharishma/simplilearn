package arthimeticcalculator;
import java.util.Scanner;
public class ArthimeticCalculator
{
	public static void main(String[] args) {
		double a, b, ans;
		char operator;
		int choice;
		Scanner scan= new Scanner(System.in);
		System.out.println("Choose an operator : +, -, *, / ");
		System.out.println("1. + ");
		System.out.println("2. - ");
		System.out.println("3. * ");
		System.out.println("4. / ");
		choice = scan.nextInt();
		
		if (choice>=1 && choice<=4)
		{
			System.out.println("\n Enter any two numbers: ");
			a = scan.nextDouble();
			b = scan.nextDouble();
			if(choice==1)
				ans = a+b;
			else if (choice==2)
				ans = a-b;
			else if (choice==3)
				ans = a*b;
			else 
				ans = a/b;
		System.out.println("\n Answer= " +ans);
	}
		else
	{
		System.out.println("\n Invalid Choice");
		}
	}
}