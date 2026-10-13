import java.util.*;
public class AreaOfSquare {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter value of side:");
    int side=sc.nextInt();
    int area=side*side;
    System.out.println("area of square is:"+area);
    sc.close();
   } 
}
