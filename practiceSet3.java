// Practice Set 3 based on the string ..

import java.lang.*;
import java.util.Scanner;

public class practiceSet3 {
	public static void main(String []args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String value = sc.nextLine();
		
		//Q1 changing string to lowercase...
		System.out.println("Changing String into LowerCase : "+value.toLowerCase());	
		
		//Q2 changing the space to underscores...
		System.out.println("Changing spaces into underscore : "+value.replace(' ','_'));
		
		//Q3..
		String letter = "Dear <|name|>, Thanks a Lot !";
		System.out.println(letter.replace("<|name|>","Emir"));
		
		//Q4..
		
		System.out.println(value.indexOf("  "));
		System.out.println(value.indexOf("   "));
		
		//Q5 Escape Sequence Formatting..
		
		
		String letter1 = "Dear Harry \n This java course is awesome.\t Thanks " ;
		
		System.out.println(letter1);
		
		
		
		
	}
}
