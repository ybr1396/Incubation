package assignments;

import java.util.*;

public class QuadraticEquation {

	public static void main(String[] args) {
		double x2 = 0, x1 = 0;
		double real_number,imaginary_number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		double a = sc.nextDouble();
		
		System.out.println("Enter the value of b:");
		double b = sc.nextDouble();
		
		System.out.println("Enter the value of c:");
		double c = sc.nextDouble();
		
		double determinant = (b*b)-(4*a*c);
		double sqrt = Math.sqrt(Math.abs(determinant));
		
		if(determinant>0) {
			
			x1 =(-b+sqrt)/(2*a);
			x2 = (-b-sqrt)/(2*a);
		System.out.println("Roots are Real" + x1 + "and Distinct" +x2);	
		} else if (determinant==0) {
			System.out.println("Roots are Same" + (-b+sqrt)/(2*a));
		} else {
			x1= (-b/2*a) + (sqrt/2*a);
			x2= (-b/2*a) - (sqrt/2*a);
			
			System.out.println("Roots are imaginary"+ x1+ "i"+ "and Distinct" + x2+"i" );
		}


	}

}
