package methods;

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double salary = getSalary();
        double creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);
    }

    public static void notifyUser(boolean qualified){
        if(qualified) System.out.println("Congrats, you have been approved");
        else System.out.println("You've been declined");
    }

    public static double getSalary(){
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static double getCreditScore(){
        System.out.println("Enter your credit score");
        double creditScore = scanner.nextDouble();
        return creditScore;
    }

    public static boolean isUserQualified(double salary, double creditScore){
      if(salary >= requiredSalary && creditScore >= requiredCreditScore){
          return true;
      }
      else return false;
    }

}
