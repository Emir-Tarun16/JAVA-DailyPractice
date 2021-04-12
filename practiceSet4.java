// Practice Set 4 ...

import java.lang.*;
import java.util.Scanner;

public class practiceSet4 {
	public static void main(String []args) {
		
		//Q1 Check the answer
		int a = 10;
		if(a == 11) {
			System.out.println("I am 11");
			
		}
		else {
			System.out.println(" I am not 11");
			
		}
		Scanner sc =new Scanner(System.in);
		
		//Q1 ....
		System.out.println("Pass/Fail Evaluator");
		System.out.println("*********************");
		
			System.out.println("Enter the First subject Marks  : ");
			float sub1_marks = sc.nextFloat();
			
			System.out.println("Enter the Second subject Marks  : ");
			float sub2_marks = sc.nextFloat();
			
			System.out.println("Enter the Third subject Marks  : ");
			float sub3_marks = sc.nextFloat();
				
				double total = (sub1_marks +sub1_marks +sub1_marks)/3 * 100;
			
			if(sub1_marks>=33 && sub2_marks>=33 && sub3_marks>=33){
				if(total >=40) {
					System.out.println("pass");
					}
			}
			else {
				System.out.println("Fail");
			}
			
		
		//Q4...
		
			String website = sc.next();
			if(website.endsWith(".org")){
			  System.out.println("This is an organizational website");
			}
			else if(website.endsWith(".com")){
			    System.out.println("This is a Commercial website");
			}
			else if(website.endsWith(".in")){
			    System.out.println("This is an Indian website");
			}
	}
}
