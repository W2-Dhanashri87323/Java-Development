import java.util.*;

public class Demo02 {
    public static void main(String[] args) {
        // If else Conditional Statements :-->

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value Dhanu and number between 0 to 10 ");
        System.out.print("Enter the value Name : ");
        String name = sc.next();
        System.out.print("Enter the number between 0 to 10 : ");
        int number = sc.nextInt();

        if (name.equals("Dhanu") && (number <= 10 && number >= 0)) {
            System.out.println("Valid Inputs ");

        } else {
            System.out.println("Invalid Inputs ");
        }

        // Loops -->

        for (int i = 0; i <= 20; i++) {
            if (i == 10) {
                break;
            }
            System.out.println(i);

        }

        for (int j = 20; j >= 0; j--) {
            if (j == 10) {
                continue;
            }
            System.out.println(j);
        }

        // Switch case statement :--->
        String Today = "Monday";

        switch (Today) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Thuesday":
                System.out.println("Today is Monday");
                break;
            case "Friday":
                System.out.println("Today is Monday");
                break;

            default:
                System.out.println("Today in unknown");

        }

    }

}
