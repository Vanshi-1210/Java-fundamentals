import java.util.Scanner;

public class StudentMarksMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Enter 1 to input marks");
            System.out.println("Enter 0 to stop");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's marks (0-100): ");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks entered");
                }
            }

        } while (choice != 0);

        System.out.println("Program stopped.");
        sc.close();
    }
}