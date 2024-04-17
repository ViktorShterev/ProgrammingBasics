package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SummerOutfit {
    public SummerOutfit() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grad = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        String outfit = "";
        String shoes = "";
        if (grad >= 10 && grad <= 18) {
            if (timeOfDay.equals("Morning")) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";

            } else if (timeOfDay.equals("Afternoon")) {
                outfit = "Shirt";
                shoes = "Moccasins";

            } else if (timeOfDay.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";

            }
        } else if (grad > 18 && grad <= 24) {
            if (timeOfDay.equals("Morning")) {
                outfit = "Shirt";
                shoes = "Moccasins";

            } else if (timeOfDay.equals("Afternoon")) {
                outfit = "T-Shirt";
                shoes = "Sandals";

            } else if (timeOfDay.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";

            }
        } else if (grad >= 25) {
            if (timeOfDay.equals("Morning")) {
                outfit = "T-Shirt";
                shoes = "Sandals";

            } else if (timeOfDay.equals("Afternoon")) {
                outfit = "Swim suite";
                shoes = "Barefoot";

            } else if (timeOfDay.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";

            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", grad, outfit, shoes);
    }
}
