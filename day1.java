// Multiplication table of n by inputting from user ....

import java.lang.*;
import java.util.Scanner;

public class day1 {
	
	public static void main(String []args){
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Day 1 Challenge by Learn code Online");
		System.out.println("**********************************");
			
			System.out.println("Enter the number : ");
			int n = sc.nextInt();
			
			for(int i = 1; i<=10 ; i++){
				System.out.printf("%d X %d = %d\n",n,i,n*i);
			}		
	}
}
