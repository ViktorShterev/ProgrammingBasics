package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        switch (operator) {
            case "+":
                int sum = n1 + n2;
                if (sum % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", n1, n2, sum);
                } else {
                    System.out.printf("%d + %d = %d - odd", n1, n2, sum);
                }
                break;
            case "-":
                int sum1 = n1 - n2;
                if (sum1 % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", n1, n2, sum1);
                } else {
                    System.out.printf("%d - %d = %d - odd", n1, n2, sum1);
                }
                break;
            case "*":
                int sum2 = n1 * n2;
                if (sum2 % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", n1, n2, sum2);
                } else {
                    System.out.printf("%d * %d = %d - odd", n1, n2, sum2);
                }
                break;
            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    double sum3 = n1 * 1.0 / n2;
                    System.out.printf("%d / %d = %.2f", n1, n2, sum3);
                }
                break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    int sum4 = n1 % n2;
                    System.out.printf("%d %% %d = %d", n1, n2, sum4);}
                    break;
                }
        }
    }
