package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        if (sex.equals("m")) {
            if (age < 16.0) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        } else if (age < 16.0) {
            System.out.println("Miss");
        } else {
            System.out.println("Ms.");
        }

    }
}
