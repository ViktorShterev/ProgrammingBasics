package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int page = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());
        int finalHours = page / hour / day;
        System.out.println(finalHours);
    }
}
