import java.util.Scanner;

public class StringsExercise {
	
	  //From Slide 66 of "Week 6, Day 2" Deck
	
      public static void main(String[] args){

          Scanner userInput = new Scanner(System.in); 
          
          String animal1 = "cow";
          String animal2 = "pig";
          String animal3 = "rooster";
          String animal4 = "sheep";
          String animal5 = "donkey";
          

          System.out.println("*** Farm Animal Sounds ***");
          System.out.println("Enter farm animal:");
        
          String animalEntered = userInput.nextLine();

          if (animalEntered.equals(animal1)) {
             System.out.printf("moo\n");
          } else if (animalEntered.equals(animal2))  {
      	   System.out.printf("oink\n"); 
          } else if (animalEntered.equals(animal3))  {
      	   System.out.printf("cock-a-doodle-doo\n"); 
          } else if (animalEntered.equals(animal4))  {
      	   System.out.printf("baa\n"); 
          } else if (animalEntered.equals(animal5))  {
      	   System.out.printf("hee-haw\n"); 
          } else {
      	   System.out.printf("Hmm... unknown farm animal.\n");
          }

      }    
    
}