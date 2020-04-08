import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercisesApplication {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter a string: ");
        String userInput = input.nextLine();

        if (StringUtils.isNumeric(userInput)) {
            System.out.println("\"" + userInput + "\" is a number");
        }else  {
            System.out.println("\"" + userInput + "\" is not a number");
        }

        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        System.out.println("Flipped Case: " + StringUtils.reverse(userInput));
    }
}
