// Function to calculate factorial
import java.util.*;
public class FactorialUsingFunction {
   public static void printFactorial(int n){

    if(n<=0){
        System.out.println("Invalid number");
    }
   int fact=1;
   for(int i=n;i>=1;i--){
    fact=fact*i;
   }
   System.out.print("factorial of "+n+" is "+fact);
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter value of n:");
    int n=sc.nextInt();
     printFactorial(n);
     sc.close();
   }
}

