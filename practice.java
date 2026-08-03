import java.util.*;
public class practice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of value a:");
        int a=sc.nextInt();
        System.out.println(a);
        System.out.print("enter your name:");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println(name);
        System.out.print("Enter value of b:");
        float b=sc.nextFloat();
        System.out.println(b);
        sc.close();
    }
}
