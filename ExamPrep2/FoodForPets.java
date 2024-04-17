package ExamPrep2;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double foodAll = Double.parseDouble(scanner.nextLine());
        double cookie = 0;
        double cookieAll = 0;
        double allDay = 0;
        int dog = 0;
        int cat = 0;
        for (int i = 1; i <= days; i++) {
            int foodDog = Integer.parseInt(scanner.nextLine());
            int foodCat = Integer.parseInt(scanner.nextLine());
            int sumDay = foodCat + foodDog;
            allDay += sumDay;
            dog += foodDog;
            cat += foodCat;
            if (i % 3 == 0){
                cookie = sumDay * 0.1;
                cookieAll += cookie;
            }
        }
        System.out.printf("Total eaten biscuits: %dgr.\n", Math.round(cookieAll));
        System.out.printf("%.2f%% of the food has been eaten.\n", (allDay / foodAll) * 100);
        System.out.printf("%.2f%% eaten from the dog.\n", (dog / allDay) * 100);
        System.out.printf("%.2f%% eaten from the cat.", (cat / allDay) * 100);
    }
}
