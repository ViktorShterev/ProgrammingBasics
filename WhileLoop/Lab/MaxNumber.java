package WhileLoop.Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = Integer.MIN_VALUE;
        while (!input.equals("Stop")) {
            int current = Integer.parseInt(input);
            if (current > num) {
                num = current;
            }
            input = scanner.nextLine();

        }
        System.out.println(num);
    }
}
