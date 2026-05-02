// Program to calculate the sum of first n natural numbers
// entered by the user
import java.util.*;
public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        sc.close();
    }
}
