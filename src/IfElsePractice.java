import java.util.Scanner;

public class IfElsePractice {
	
	  //From Slide 49 of "Week 6, Day 2" Deck
	
      public static void main(String[] args){

          Scanner userInput = new Scanner(System.in);    
          
          int numberStored = 7;

          System.out.println("*** Guessing Game ***");
          System.out.println("What number do you think is stored in the program?");
          
          int numberGuessed = Integer.parseInt(userInput.nextLine());

          if (numberGuessed == numberStored ) {
             System.out.println("Wow!\n");
          } else {
        	  System.out.println("Nope!\n");
          }

          
          int gradeThreshold = 60;
          
          System.out.println("*** Number Grade ***");
          System.out.println("What was your number grade?");
          
          int gradeProvided = Integer.parseInt(userInput.nextLine());

          if (gradeProvided >= gradeThreshold ) {
             System.out.println("Congrats! You passed.\n");
          } else {
        	  System.out.println("Sorry! You need to take the class again.\n");
          }
          
      }    
      
}


