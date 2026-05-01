// Program to calculate the area of a circle
// by taking radius as input from the user
import java.util.*;
public class CircleAreaCalculator {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter radius of circle:");
    int r=sc.nextInt();
    double area=3.14*r*r;
    System.out.println("Area of circle:"+area);
    sc.close();
    }
}
