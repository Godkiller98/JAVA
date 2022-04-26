
// 
// assignment no 1 for hexaware.
import java.util.Scanner;
class t{
  public static void main(String args[]){
    System.out.println("Enter the choice ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Enter the id");
    int id=sc.nextInt();
    System.out.println("Enter the Name");
    String name=sc.next();
    System.out.println("Enter the age");
    int age= sc.nextInt();
    System.out.println("Id of the employee is: "+ id);
    System.out.println("Id of the employee is: "+ name);
    System.out.println("Id of the employee is: "+ age);
    switch(n){
      case 1: System.out.println("Designation is Clerk");
      System.out.println("Salary is 1500");
      break;

      case 2: System.out.println("Designation is Developer");
      System.out.println("Salary is 25000");
      break;

      case 3: System.out.println("Designation is Tester");
     System.out.println("Salary is 20000");
     break;

     case 4: System.out.println("Designation is Manager");
    System.out.println("Salary is 50000");
    break;

    default: System.out.println("Invalid number");
    }
  }
}
