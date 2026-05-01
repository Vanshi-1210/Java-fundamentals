// Program to perform basic arithmetic operations
// based on user input
import java.util.*;
public class CalculatorUsingSwitch {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter value of a:");
    int a=sc.nextInt();
    System.out.print("Enter value of b:");
    int b=sc.nextInt();
    System.out.print("press button:");
    int button=sc.nextInt();
    switch(button){
 case 1:System.out.println("Addition:"+(a+b));
 break;
 case 2:System.out.println("Subtraction:"+(a-b));
 break;
  case 3:System.out.println("Multiplication:"+(a*b));
 break;
  case 4:System.out.println("Division:"+(a/b));
 break;
  case 5:System.out.println("Modulo:"+(a%b));
 break;
  default:System.out.println("Invalid button");
    }
    sc.close();
  }  
}
