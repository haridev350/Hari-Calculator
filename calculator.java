
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter your choice 1 (ADD) 2 (SUB) 3(MULT) 4 (DIV) 5 (REMAINDER)");
		a = sc.nextInt();
		if (a == 1) {
			System.out.println("Enter 1st number");
			b = sc.nextInt();
			System.out.println("Enter 2nd number");
			c = sc.nextInt();
			
			d= b+c;
			System.out.println("The answer is " + d);
		}
		else if (a == 2) {
			System.out.println("Enter 1st number");
			b = sc.nextInt();
			System.out.println("Enter 2nd number");
			c = sc.nextInt();
			
			d= b-c;
			System.out.println("The answer is " + d);
		}
		else if (a == 3) {
			System.out.println("Enter 1st number");
			b = sc.nextInt();
			System.out.println("Enter 2nd number");
			c = sc.nextInt();
			
			d= b*c;
			System.out.println("The answer is " + d);
		}
		else if (a == 4) {
			System.out.println("Enter 1st number");
			b = sc.nextInt();
			System.out.println("Enter 2nd number");
			c = sc.nextInt();
			
			d= b/c;
			System.out.println("The answer is " + d);
		}
		else if (a == 5) {
			System.out.println("Enter 1st number");
			b = sc.nextInt();
			System.out.println("Enter 2nd number");
			c = sc.nextInt();
			
			d= b%5c;
			System.out.println("The answer is " + d);
		}
		else {
			System.out.println("The choice is wrong ! Enter different choice ");
		}
	
		

	}

}
