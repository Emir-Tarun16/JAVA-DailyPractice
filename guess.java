// Guess the number game in java

import java.lang.*;
import java.util.Scanner;
import java.util.Random;

class Game {
	
	public int number;
	public int inputNumber;
	public int noOfGuesses = 0;
	
	public int getNoofGuesses(){
		return noOfGuesses;
	}
	
	public void setNoOfGuesses(int noOfGuesses){
		this.noOfGuesses = noOfGuesses;
	}
	
	Game(){
		
		Random random = new Random();
		this.number = random.nextInt(100);
	}
	
	void takeUserInput(){
		
		System.out.println("Enter the number : ");
		Scanner sc =new Scanner(System.in);
		inputNumber = sc.nextInt();
	}	
	
	boolean isCorrectNumber(){
		noOfGuesses++;
		
			if(inputNumber == number){
				System.out.format("You guesses right, it was %d\n and you guess it in %d attempts,",number,noOfGuesses);
				return true;  
			}
			   else if(inputNumber<number){
          			  System.out.println("Too low...");
     			   }
      				  else if(inputNumber>number){
          				  System.out.println("Too high...");
      				  }
     			   return false;
    		}
	}
	
	public class guess{
		
		public static void main(String []args){
			 Game g = new Game();
       		 boolean b= false;
      			  while(!b){
       		 g.takeUserInput();
       		 b = g.isCorrectNumber();
		}
	}
	}

