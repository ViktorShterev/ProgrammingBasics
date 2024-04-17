package WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        String input = scanner.nextLine();
        int num = 0;
        while (!input.equals("No More Books")){
            input = scanner.nextLine();
            num++;
            if (input.equals(book)){
                System.out.printf("You checked %d books and found it.", num);
                break;
            }
            if (input.equals("No More Books")){
                System.out.printf("The book you search is not here!%nYou checked %d books.", num);
            }
        }
    }
}
