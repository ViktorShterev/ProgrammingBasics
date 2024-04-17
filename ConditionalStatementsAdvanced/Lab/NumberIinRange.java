package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class NumberIinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num >= -100 && num != 0 && num <= 100) {
            System.out.printf("Yes");
        } else {
            System.out.printf("No");
        }

    }
}
