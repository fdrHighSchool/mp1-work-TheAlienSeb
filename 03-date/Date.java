
/**
 * Write a description of class Date here.
 *
 * @author Sebastian
 * @version 9/28/22
 */
import java.util.Scanner;
public class Date
{
    public static void main(String[] args){
    Scanner Date = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Year");
    String Year = Date.nextLine(); 
    
    Scanner Date2 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Month");
    String Month = Date2.nextLine(); 
    
    Scanner Date3 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Day");
    String Day= Date3.nextLine(); 
    
    
    
    Scanner Date4 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter rough time estimate");
    String Time = Date4.nextLine(); 
    
    
    System.out.println("American Date: " + Month + "/" + Day + "/" + Year + "\t Time is: " + Time);
    System.out.println("European Date: " + Year + "/" + Day + "/" + Month + "\t Time is: " + Time);
    
    
    
    
    
    
    
    
    
    
    // Read user input
    }
}
