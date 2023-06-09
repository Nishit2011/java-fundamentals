package basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Enter principal: ");
        Scanner scanner = new Scanner(System.in);
        double p = scanner.nextDouble();
        System.out.println("Enter rate: ");
        double r = scanner.nextDouble();
        System.out.println("Enter time in years: ");
        int t = scanner.nextInt();
        double si = calculateSI(p,r,t);
        System.out.println("The Simple Interest is: "+ si);
    }

    public static double calculateSI(double p, double r, int t){
        return (p * r * t)/100 ;
    }

}
