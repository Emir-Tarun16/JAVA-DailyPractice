// Practice Set 5 on java 

import java.lang.*;
import java.util.Scanner;

public class practiceSet5 {
	
	public static void main(String []args){
		
		Scanner sc =new Scanner(System.in);
		
		//Q1 Pattern Printing ...
		/*int n = 4;
		for(int i=n ; i>0 ; i--){
			for(int j=0; j<i;j++){
				System.out.println("*");
			}
			System.out.println(" ");
		}*/
		
		//Q2. Write a program to sum first n even numbers.
		
		System.out.println("Enter the number for sum of first n Even Numbers : ");
		int number = sc.nextInt();
			int sum = 0;
			for(int i=0;i<=number;i++){
				sum += 2*i;
				
			}
			System.out.println(sum);
			System.out.println("\n");
		
		//Q3 Write a program to print the multiplication table of a given number n. ...
		System.out.println("Enter the number for Multipliacation Table  : ");
		int table = sc.nextInt();
			for(int i=1;i<=10;i++){
				System.out.printf("%d X %d = %d\n",table,i,table*i);
				System.out.println("\n");
		}
		
		//Q4. Write a program to print a multiplication table of 10 in reverse order.
		
		System.out.println("Multiplication of 10 in Reverse order : ");
		int table_n = 10;
		for(int i = table_n;i>=0;i--){
			System.out.printf("%d X %d = %d\n",table_n,i,table_n*i);
		}
		System.out.println("\n");
		
		//Q5. Write a program to find factorial of a given number using for loops
		
		System.out.println("Factorial of n number");
		System.out.println("Enter the number for obtaining factorial  :  ");
		int fact_n = sc.nextInt();
			int fact = 1;
			for(int i= 1; i<=fact_n; i++){
				fact *= i;
			}
		System.out.println(fact);
		System.out.println("\n");
		
		//Q6. Write a program to calculate the sum of the numbers occurring in the multiplication table of 8
		
		int table_number = 8;
		int sum_of_table =0;
		
			for(int i=1;i<=10;i++){
				sum_of_table += table_number*i;
			}
			 
			System.out.println("The Sum of table 8 is  : "+sum_of_table);
		System.out.println("\n");
		
			
	}
}
