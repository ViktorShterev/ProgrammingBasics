package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double annualInterest = Double.parseDouble(scanner.nextLine()) / 100.0;
        double finalSum = sum + (double)period * (sum * annualInterest / 12.0);
        System.out.println(finalSum);
    }
}
