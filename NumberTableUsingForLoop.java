// Program to print multiplication table of a number
// entered by the user using loop
import java.util.*;
public class NumberTableUsingForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.print("Enter the value of n:");
      int n=sc.nextInt();
      for(int i=1;i<=10;i++){
        System.out.println(n*i);
      }
      sc.close();
    }
}
