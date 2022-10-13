import java.util.Scanner;



public class subString {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Are you a Teacher or a Student?");
        String role = s.nextLine(); 

        System.out.println("Enter your first name:");
        String firstName = s.nextLine();

        System.out.println("Enter your last name:");
        String lastName = s.nextLine();

        System.out.println("Enter your favorite number:");
        String favNumber = s.nextLine();

       if (role.equals("Teacher") || role.equals("teacher")) {
        role = "@schools.nyc.gov";
        System.out.println("Your email is: ");
        System.out.println(initialize(firstName) + lastName + favNumber + role);
       } else if (role.equals("Student") || role.equals("student")) {
        role = "@nycstudents.net";
        System.out.println("Your email is: ");
        System.out.println(firstName + initialize(lastName) + favNumber + role);

       } else {
        System.out.println("If you are a teacher, type Teacher. If you are a student, type Student");
       }







        s.close();





}



public static String initialize(String n) {
    return n.substring(0, 1);
    
}




















}