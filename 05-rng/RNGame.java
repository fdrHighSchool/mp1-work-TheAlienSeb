import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
/**
 * Write a description of class RNGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RNGame
{
    public static void main(String[] args) {




        Random randNum = new Random();
        System.out.print("Lets play a game. \nWhat kind of mode? \nEasy \nMedium \nHard\n");

        Scanner mode = new Scanner(System.in);
        String gameMode = mode.nextLine();
        // mode.close();`

        Scanner input = new Scanner(System.in);
        if (gameMode.equals("Easy")) {
            int compNu = (int)(Math.random() * 3 + 1);
            System.out.println(" Lets try to guess the same number out of 3!");
            
            int Guess = input.nextInt();
            
            input.close();
            
            int change = Math.abs(compNu - Guess);
            
            
            System.out.println(" Your guess was: " + Guess);
            System.out.println(" I was thinking of: " + compNu);
            
            if (compNu == Guess){
                System.out.println(" OMG you matched my number out of 3");
            } else {
                System.out.println(" Damn we were " + change + " apart, let's try again");
            }

        } else if (gameMode.equals("Medium")) {
            
            int compNu =(int)(Math.random() * 30 + 1);;
            System.out.println(" Lets try to guess the same number out of 30!");
            
            int Guess = input.nextInt();
            
            input.close();
            
            int change = Math.abs(compNu - Guess);
            
            
            System.out.println(" Your guess was: " + Guess);
            System.out.println(" I was thinking of: " + compNu);
            
            if (compNu == Guess){
                System.out.println(" OMG you matched my number out of 30");
            } else {
                System.out.println(" Damn we were " + change + " apart, let's try again");
            }

        } else if (gameMode.equals("Hard")) {
            
            int compNu =(int)(Math.random() * 100 + 1);;
            System.out.println(" Lets try to guess the same number out of 100!");
            
            int Guess = input.nextInt();
            
            input.close();
            
            int change = Math.abs(compNu - Guess);
            
            
            System.out.println(" Your guess was: " + Guess);
            System.out.println(" I was thinking of: " + compNu);
            
            if (compNu == Guess){
                System.out.println(" OMG you matched my number out of 100");
            } else {
                System.out.println(" Damn we were " + change + " apart, let's try again");
            }

        }else {
            System.out.println("Put in the modes either \nEasy \nMedium \nHard");
        }
        

        
        mode.close();
        
        
        
        
    }
}
