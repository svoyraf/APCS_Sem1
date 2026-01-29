/*
 *	Author: Raffi A.
 *  Date: 09/09/25
 *	Collaborator(s): None
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number:");
	int num1 = sc.nextInt();
	int num2 = num1 + 1;
	int num3 = num1 + 2;
	int num4 = num1 + 3;
	int num5 = num1 + 4;
	int num6 = num1 + 5;
    System.out.println();
    
    System.out.println("Here are the next 5 numbers!");
    System.out.print(num1 + ",");
	System.out.print(" " + num2 + ",");
	System.out.print(" " + num3 + ",");
	System.out.print(" " + num4 + ",");
	System.out.print(" " + num5 + ",");
	System.out.println(" " + num6 + ",");
	
	System.out.println("Here are the next 5 multiples of " + num1 + "!");
	int mult1 = num1 + num1;
	int mult2 = num1 + mult1;
	int mult3 = num1 + mult2;
	int mult4 = num1 + mult3;
	int mult5 = num1 + mult4;
	
	System.out.print(num1 + ",");
	System.out.print(" " + mult1 + ",");
	System.out.print(" " + mult2 + ",");
	System.out.print(" " + mult3 + ",");
	System.out.print(" " + mult4 + ",");
	System.out.println(" " + mult5 + ",");
	
	System.out.println("Here is " + num1 + " divided by 100!");
	double num100 = (num1/100.0);
	System.out.println(num100);
	
	System.out.println("Here is " + num1 + " divided by 10!");
	double num10 = (num1/10.0);
	System.out.print(num10);
	
	
	}
}
