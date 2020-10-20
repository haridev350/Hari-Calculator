
import java.util.Scanner;//Importing Scanner class to get data from user
public class calculator {// Declaring the Class 

	public static void main(String[] args) {//Declaring the function
		Scanner sc = new Scanner(System.in);// Creating new object to get user Data
		int a,b,c,d;// Declaring Variables to store the user data
		System.out.println("Enter your choice 1 (ADD) 2 (SUB) 3(MULT) 4 (DIV) 5 (REMAINDER)");//*
		a = sc.nextInt();// Gets the user input and stores it in variable a 
		if (a == 1) {// Loop statement used to calculate as per user choice .
			System.out.println("Enter 1st number");
			b = sc.nextInt();
			System.out.println("Enter 2nd number");
			c = sc.nextInt();
			
			d= b+c;// Adds the two numbers 
			System.out.println("The answer is " + d);//Gives the output 
		}
		else if (a == 2) {
			System.out.println("Enter 1st number");
			b = sc.nextInt();
			System.out.println("Enter 2nd number");
			c = sc.nextInt();
			
			d= b-c;// Subtracts the two numbers
			System.out.println("The answer is " + d);
		}
		else if (a == 3) {
			System.out.println("Enter 1st number");
			b = sc.nextInt();
			System.out.println("Enter 2nd number");
			c = sc.nextInt();
			
			d= b*c;// multiplies the two numbers
			System.out.println("The answer is " + d);
		}
		else if (a == 4) {
			System.out.println("Enter 1st number");
			b = sc.nextInt();
			System.out.println("Enter 2nd number");
			c = sc.nextInt();
			
			d= b/c;// divides the two numbers
			System.out.println("The answer is " + d);
		}
		else if (a == 5) {
			System.out.println("Enter 1st number");
			b = sc.nextInt();
			System.out.println("Enter 2nd number");
			c = sc.nextInt();
			
			d= b%5;//divides the two numbers , but outputs the remainder.
			System.out.println("The answer is " + d);
		}
		else {
			System.out.println("The choice is wrong ! Enter different choice ");
		//* If the user chose a diffrent choice from the above code(the star one ),it will not get any data from user.
			
			
		}
	
		sc.close();

	}

}
