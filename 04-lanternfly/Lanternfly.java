import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class Lanternfly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lanternfly
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Theres too many flies in the cafeteria");
        System.out.println("You need to squash some to stop them from spitting"); 
        System.out.println("in your food");
        System.out.println("How many flies did you squash so far?");
        
        int num = input.nextInt();
        int change = Math.abs(num - 20);
        
        
        
        if (num < 10) {
            System.out.println("Thats not enough!");
        } else if(num >= 20)  {
            System.out.println("Wow great round job");
        } else {
            System.out.println("Man you could've done " + change + " more");
        }
    }
}
