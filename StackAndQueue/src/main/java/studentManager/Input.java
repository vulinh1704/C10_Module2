package studentManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner input = new Scanner(System.in);

    public static String inputString() {
        String str = input.nextLine();
        return str;
    }

    public static int inputInt() {
        do {
            try {
                int number = Integer.parseInt(input.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format, pls enter input again!");
            }
        } while (true);
    }
}
