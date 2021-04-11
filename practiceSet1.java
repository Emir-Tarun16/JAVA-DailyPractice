// Que 1 : Addition of three numbers in java

import java.util.Scanner;
public class practiceSet1 {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Three numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1 + num2 + num3;
		
		double sub_cgpa = (sum * 9.5)/100;
		
		
		System.out.println("Enter the value in Kilometers : ");
		float km_value = sc.nextFloat();
		double mile_value = km_value/1.609;
		
		System.out.println("Enter the number to check weather the number is integer or not ");
		boolean intCheck = sc.hasNextInt();
		
		
		 
			System.out.println("**************************");
			System.out.println("The sum of three numbers is : "+sum); //Q1 sum of three numbers
			System.out.println("CGPA : "+sub_cgpa);   //Q2 : Calculate the CGPA
			System.out.println("Hello "+name+" have a good day");  //Q3 take username and greet Him
			System.out.println("The Mile Value of "+km_value+" is "+mile_value); //Q4 km to mile
			System.out.println(intCheck);
	}	

}


