import java.util.*;
public class TotalCostOfItems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter price of pencil:");
        float pencilPrice=sc.nextFloat();
        System.out.print("Enter price of pen:");
        float penPrice=sc.nextFloat();
        System.out.print("Enter price of eraser:");
        float eraserPrice=sc.nextFloat();
        double totalCost=penPrice+pencilPrice+eraserPrice;
        System.out.println("Total cost of items:"+totalCost);
        sc.close();
    }
    
}
