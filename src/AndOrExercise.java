import java.util.Scanner;

public class AndOrExercise {
	
	  //From Slide 50 of "Week 6, Day 2" Deck
	
      public static void main(String[] args){

          Scanner userInput = new Scanner(System.in);    
          
          int numberStored = 7;
          int lowerBound = numberStored - 5;
          int upperBound = numberStored + 5;

          System.out.println("*** Updated Guessing Game ***");
          System.out.println("Give a number between 1 and 100:");
          
          int numberGuessed = Integer.parseInt(userInput.nextLine());

          if (numberGuessed == numberStored ) {
             System.out.println("Wow!\n");
          } else if (lowerBound <= numberGuessed && numberGuessed <= upperBound) {
        	 System.out.println("Oh! So close!"); 
          } else {
        	 System.out.println("Nope!\n");
          }

      }    
      
}


