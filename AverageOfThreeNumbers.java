import java.util.*;
public class AverageOfThreeNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a:");
        float a=sc.nextFloat();
        System.out.print("Enter value of b:");
        float b=sc.nextFloat();
        System.out.print("Enter value of c:");
        float c=sc.nextFloat();
        double avg=(a+b+c)/3;
        System.out.print(avg);
        sc.close();
        
    }
}