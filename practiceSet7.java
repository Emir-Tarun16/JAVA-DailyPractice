// Practice Set 7 on Java Methods and Recursion ..


import java.lang.*;

public class practiceSet7 {
	
	
	
	//Write a Java method to print the multiplication table of a number n
		
		
		
		static void table(int n){
			for(int i=1 ; i<=10 ; i++){
				System.out.format("%d x %d = %d\n",n,i,n*i);
			}
		}

	//Q2. Pattern 1 printing
		static void pattern1(int n){
			for(int i = 0; i<n;i++){
				for(int j=0;j<i;j++){
					System.out.print("*");
				}
				System.out.println(" ");
			}
		}
		
	//Q3. Write a recursive function to calculate the sum of first n natural numbers.
		static int recSum(int n){
			if(n == 1){
				return 1;
			}
			return n + recSum(n-1);
			
		}
		
	//Q.4 Fibonnacci Series 
	
		static int fibo(int n){
			if(n == 1){
				return 0;
			}
			else if(n == 2){
				return 1;
			}
			else {
				return fibo(n - 1) + fibo(n - 2);
			}
		}
				
		public static void main(String []args){
			table(4);
			int sumOf = recSum(10);
			System.out.println(sumOf);
			pattern1(6);
			int result = fibo(8);
			System.out.println(result);
		}
		
		
}

		
