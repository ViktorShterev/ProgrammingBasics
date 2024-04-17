package WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeA = Integer.parseInt(scanner.nextLine());
        int sizeB = Integer.parseInt(scanner.nextLine());
        int cake = sizeB * sizeA;
        String command = scanner.nextLine();
        while (!command.equals("STOP")) {
            int guest = Integer.parseInt(command);
            cake -= guest;
            if (cake <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cake));
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("STOP")) {
            System.out.printf("%d pieces are left.", cake);
        }
    }
}

