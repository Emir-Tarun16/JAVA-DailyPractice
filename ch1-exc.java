// Write a program to calculate the cbse student percentage of 5 subjects

import java.util.Scanner;

class cbsePercentage { 

	public static void main(String []args){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Welcome to CBSE Percentage Calculator " );
		System.out.println("*******************************");
		
			System.out.println("Enter the Name of the Student : ");
			String stu_name = sc.nextLine();
			
			System.out.println("Enter the total Mark of the "+stu_name);
			int total = sc.nextInt();
			
			System.out.println("Enter the Five Subject Marks :");
				float s1 = sc.nextFloat();
				float s2 = sc.nextFloat();
				float s3 = sc.nextFloat();
				float s4 = sc.nextFloat();
				float s5 = sc.nextFloat();
			
		float total_mark = (s1+s2+s3+s4+s5);
		float grand_total = (total_mark  * 100) / total;
			System.out.println("Percentage of "+stu_name+" is "+grand_total); 
			
	
	}
}
