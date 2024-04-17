package WhileLoop.Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int total = 0;
        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            total += steps;
            if (total >= 10000) {
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Going home")){
            int addSteps = Integer.parseInt(scanner.nextLine());
            total += addSteps;
        }
        if (total >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", total - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - total);
        }
    }
}
