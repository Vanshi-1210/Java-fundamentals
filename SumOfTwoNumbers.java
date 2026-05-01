// Program to take two numbers as input from the user
// and print their sum
import java.util.*;
public class SumOfTwoNumbers {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter value of a:");
    int a=sc.nextInt();
    System.out.print("Enter value of b:");
    int b=sc.nextInt();
    int sum=a+b;
    System.out.println("sum of a and b is:"+sum);
    sc.close();
}
   } 
   
