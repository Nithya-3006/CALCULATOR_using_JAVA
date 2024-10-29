package calculator;
import java.util.*;
public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Welcome to the Online Calculator");
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for subtraction");
		System.out.println("Enter 3 for multiplication");
		System.out.println("Enter 4 for division");
		System.out.println("Enter 5 for Factorial");
		System.out.println("Enter 6 for Square");
		System.out.println("Enter 7 for SquareRoot");
		System.out.println("Enter the operation : ");
		int op = sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("Enter the two numbers");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			Addition a = new Addition(num1,num2);
			System.out.println("Addition is " +a.method());
			break;
		case 2:
			System.out.println("Enter the two numbers");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			Subtraction s = new Subtraction(num1,num2);
			System.out.println("Subtraction is " +s.method());
			break;
		case 3:
			System.out.println("Enter the two numbers");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			Multiplication m = new Multiplication(num1,num2);
			System.out.println("Multiplication is " +m.method());
			break;
		case 4:
			System.out.println("Enter the two numbers");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			Division d = new Division(num1,num2);
			System.out.println("Division is "+d.method());
			break;
		case 5:
			System.out.println("Enter a number : ");
			int fact = sc.nextInt();
			Factorial f = new Factorial(fact);
			System.out.println("Factorial of " + fact + " is " + f.method(fact));
			break;
		case 6:
			System.out.println("Enter a number : ");
			int sq = sc.nextInt();
			Square ss = new Square(sq);
			System.out.println("Square of " + sq + " is " + ss.method(sq));
			break;
		case 7:
			System.out.println("Enter a number : ");
			int sqr = sc.nextInt();
			SquareRoot sr = new SquareRoot(sqr);
			System.out.println("Square root of " + sqr + " is " + sr.method(sqr));
			break;
		default:
			System.out.println("Invalid Operation");
		}
		sc.close();
	}
}
