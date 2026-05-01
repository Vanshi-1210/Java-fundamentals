// Program to check whether a person is an adult
// based on the age entered by the user
import java.util.*;
public class AgeEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not an Adult");
        }
        sc.close();
    }
}
