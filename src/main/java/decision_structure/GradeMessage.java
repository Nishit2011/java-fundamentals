package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next();
        scanner.close();
        String message;
        switch (grade){
            case "A":
                message = "Excellent job";
                break;

            case "B":
                message = "Good job!";
                break;

            case "C":
                message = "Average job";
                break;

            default:
                message = "Default";
                break;


        }

        System.out.println(message);

    }
}
