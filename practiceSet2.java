// practice Set 2 ..

import java.util.Scanner;
public class practiceSet2 {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		float a = (7/4) * (9/4);
		
		System.out.println("Enter the grade of student : ");
		float grade = sc.nextFloat();
		grade += 8;
		
		
		int given_value = 10;
		System.out.println("Enter the value to check : ");
		int checkValue = sc.nextInt();
		
		
		
			
			System.out.println("*********************************");
			System.out.println("Precedence value of the float Value is : "+a);  //Q1 calculating the value
			System.out.println("Final Correct grade is :"+grade);  //Q2 Decrypting final grade
			if(given_value > checkValue){
			System.out.println("given Value is Greater"); //Q3 checking value greater or not 
			
		}
		
	}
}
