// Program to take a number as input from the user
// and check whether it is even or odd
import java.util.*;
public class EvenOddChecker {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int num=sc.nextInt();
    if(num%2==0){
        System.out.println("Even num");
    }
    else{
        System.out.println("Odd num");
    }
    sc.close();
 }   
}
