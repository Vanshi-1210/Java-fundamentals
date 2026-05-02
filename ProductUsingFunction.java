// Added program to calculate product using function
import java.util.*;
public class ProductUsingFunction {
    public static int calculateProduct(int a,int b){
    int product=a*b;
    return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a=sc.nextInt();
        System.out.print("Enter value of b:");
        int b=sc.nextInt();
        int product=calculateProduct(a, b);
        System.out.println("product of a and b:"+product);
        sc.close();
    }
}
