// Program to take two numbers as input from the user
// and compare them using conditional statements
// If both numbers are equal, print "Equal"
// If first number is greater, print "A is greater"
// Otherwise, print "A is lesser"
import java.util.*;
public class NumberComparison {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter value of a:");  
      int a=sc.nextInt();
      System.out.print("Enter value of b:");
      int b=sc.nextInt();
      if(a==b){
        System.out.println("Equal");
      }
      else if(a>b){
        System.out.println("a is greater");
      }
      else{
        System.out.println("a is lesser");
      }
      sc.close();
    }
}
