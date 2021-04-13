// Rock , Paper and Scissor Game in java 

import java.lang.*;
import java.util.Scanner;
import java.util.Random;

public class excersice2 {
	public static void main(String []args){
		
		System.out.println("******  Welcome to the Game  ****** ");
		/* 0 for Rock
		   1 for Scissor
		   2 for Paper
		*/
		   
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 0 for Rock,\t 1 for Scissor and\t 2 for Paper : ");
		int user_input = sc.nextInt();
		
		// computer input using the random package inside the utils
		Random random = new Random();
		int computer_input = random.nextInt(3);
			
			if(user_input == computer_input){
				System.out.println("Match Draw ! , Try Again");
			   }
			
			else if(user_input == 0 && computer_input == 1 || user_input == 1 && computer_input == 2 ||
					user_input == 2 && computer_input == 0) {
					System.out.println("Congratulation You Win !!");
					}
			else{
			
				System.out.println("Oopss !! Computer Win ");
				}
				
		//Printin the choice of the computer machine 
		if(computer_input == 0) {
			System.out.println("Computer Choice : Rock");
			}
		else if(computer_input == 1){
			System.out.println("Computer Choice : Scissor");
			}				   
		 else{
		 	System.out.println("Computer Choice : Paper");
		 	}
	}
}
