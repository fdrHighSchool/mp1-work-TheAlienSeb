import java.util.Scanner;



public class subString {
    public static void main(String[] args){

       
       String us = nameUser();
       String pw = genPass();


       System.out.println("Your username is: " + us);
       System.out.println("Your password is: " + pw);

      }







 public static String nameUser() {

 String userName = "";

  Scanner s = new Scanner(System.in);
  System.out.println("Are you a Teacher or a Student?");
  String role = s.nextLine(); 

  System.out.println("Enter your first name:");
  String firstName = s.nextLine();

  System.out.println("Enter your last name:");
  String lastName = s.nextLine();

  System.out.println("Enter your favorite number:");
  String favNumber = s.nextLine();

 if (role.equalsIgnoreCase("teacher")) {
  role = "@schools.nyc.gov";
  System.out.println("Your email is: ");
  System.out.println(initialize(firstName) + lastName + favNumber + role);
  userName = initialize(firstName) + lastName + favNumber + role;
 } else if (role.equalsIgnoreCase("student")) {
  role = "@nycstudents.net";
  System.out.println("Your email is: ");
  System.out.println(firstName + initialize(lastName) + favNumber + role);
  userName = firstName + initialize(lastName) + favNumber + role;

 } else {
  System.out.println("If you are a teacher, type Teacher. If you are a student, type Student");
 }
 s.close();
 return userName;


 }





 public static String genPass(){
       Scanner z = new Scanner(System.in);

       System.out.println("Lets do your password now!");



       System.out.println("Whats Your favorite Snack?");
       String passSnack = z.nextLine();

       System.out.println("Whats Your favorite Color?");
       String passColor = z.nextLine();

       System.out.println("Choose the symbol # or @");
       String passSymbol = z.nextLine();

       int number = ((int)Math.random() * 100 + 25);

       
       String passWord = "";
       

       if(passSymbol.equals("#")) {
        System.out.println("Your password is");
        System.out.println(passSnack + passColor + passSymbol + number);
        passWord = passSnack + passColor + passSymbol + number;
       } else if (passSymbol.equals("@")) {
       System.out.println("Your password is");
       System.out.println(passSnack + passColor + number + passSymbol);
        passWord = passSnack + passColor + number + passSymbol;
      } else {
        System.out.println("Please Choose a valid Symbol");
      }
      z.close();

      return passWord;
 }


public static String initialize(String n) {
    return n.substring(0, 1);
    
}




















}