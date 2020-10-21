
import java.util.Scanner;//Importing Scanner class to get data from user
public class calculator {// Declaring the Class 

	public static void main(String[] args) {//Declaring the function
		Scanner sc = new Scanner(System.in);// Creating new object to get user Data
		double  b,c,d;// Declaring Variables to store the user data.
		System.out.println("Welcome to Hari Calculator v2.2!");
		System.out.println("Enter your choice 1 (ADD),2 (SUB),3(MULT),4 (DIV) and 5 (REMAINDER)");//*
		int a = sc.nextInt();// Gets the user input and stores it in variable a 
		if (a == 1) {// Loop statement used to calculate as per user choice .
			System.out.println("Enter 1st number");
			b = sc.nextDouble();
			System.out.println("Enter 2nd number");
			c = sc.nextDouble();
			
			d= b+c;// Adds the two numbers 
			System.out.println("The sum is " + d);//Gives the output 
		}
		else if (a == 2) {
			System.out.println("Enter 1st number");
			b = sc.nextDouble();
			System.out.println("Enter 2nd number");
			c = sc.nextDouble();
			
			d= b-c;// Subtracts the two numbers
			System.out.println("The difference is " + d);
		}
		else if (a == 3) {
			System.out.println("Enter 1st number");
			b = sc.nextDouble();
			System.out.println("Enter 2nd number");
			c = sc.nextDouble();
			
			d= b*c;// multiplies the two numbers
			System.out.println("The product is " + d);
		}
		else if (a == 4) {
			System.out.println("Enter 1st number");
			b = sc.nextDouble();
			System.out.println("Enter 2nd number");
			c = sc.nextDouble();
			
			d= b/c;// divides the two numbers
			System.out.println("The quotient is " + d);
		}
		else if (a == 5) {
			System.out.println("Enter 1st number");
			b = sc.nextDouble();
			System.out.println("Enter 2nd number");
			c = sc.nextDouble();
			
			d= b%5;//divides the two numbers , but outputs the remainder.
			System.out.println("The remainder is " + d);
		}
		else {
			System.out.println("Your choice is wrong ! Enter the correct choice. ");
		//* If the user chose a different choice from the above code(the star one ),it will not get any data from user.
			
			
		}
	
		sc.close();

	}

}
