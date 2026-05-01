// Program to take user input and print greeting
// using conditional statements
// If input is 1, print Hello
// If input is 2, print Namaste
// If input is 3, print Bonjour
// Otherwise, print invalid input
import java.util.*;
public class GreetingUsingConditions {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Press button:");
    int button=sc.nextInt();
    if(button==1){
        System.out.println("Hello");
    }
    else if(button==2){
        System.out.println("Namaste");
    }
    else if(button==3){
        System.out.println("Bonjour");
    }
    else{
        System.out.println("Invalid button");
    }
    sc.close();
  }
}
