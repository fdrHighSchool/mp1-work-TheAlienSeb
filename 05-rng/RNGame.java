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
        int compNum = randNum.nextInt(3);
        
        System.out.println(" Lets try to guess the same number out of 3!");
        Scanner input = new Scanner(System.in);
        int Guess = input.nextInt();
        
        input.close();
        
        int change = Math.abs(compNum - Guess);
        
        
        System.out.println(" Your guess was: " + Guess);
        System.out.println(" I was thinking of: " + compNum);
        
        if (compNum == Guess){
            System.out.println(" OMG you matched my number out of 3");
        } else {
            System.out.println(" Damn we were " + change + "apart, let's try again");
        }
        
        
        
        
        
        
    }
}
