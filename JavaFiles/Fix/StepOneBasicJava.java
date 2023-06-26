import java.util.Scanner;

public class StepOneBasicJava {
    public static void main(String[] args) {
        try (// Create a scanner object to read user input
        Scanner input = new Scanner(System.in)) {
            // Prompt the user to enter their scores for two quizzes
            System.out.println("Please enter your score for Quiz 1:");
            double quiz1 = input.nextDouble();

            System.out.println("Please enter your score for Quiz 2:");
            double quiz2 = input.nextDouble();

            // Calculate the average of the two quiz scores
            double average = (quiz1 + quiz2) / 2;

            // Display the result
            System.out.println("Your quiz average is:");
            System.out.println("*************************");
            System.out.printf("* Quiz 1:      %-8.2f *\n", quiz1);
            System.out.printf("* Quiz 2:      %-8.2f *\n", quiz2);
            System.out.println("*************************");
            System.out.printf("* Average:     %-8.2f *\n", average);
        }

        System.out.println("***************************************************************************");
        System.out.println("");
        System.out.println("    ▄▄▄▄▄▄▄ ▄▄▄▄▄▄▄ ▄▄    ▄ ▄▄▄▄▄▄▄ ▄▄▄▄▄▄   ▄▄▄▄▄▄ ▄▄▄▄▄▄▄ ▄▄▄▄▄▄▄ ▄▄ ");
        System.out.println("    █       █       █  █  █ █       █   ▄  █ █      █       █       █  █");
        System.out.println("    █       █   ▄   █   █▄█ █   ▄▄▄▄█  █ █ █ █  ▄   █▄     ▄█  ▄▄▄▄▄█  █");
        System.out.println("    █     ▄▄█  █ █  █       █  █  ▄▄█   █▄▄█▄█ █▄█  █ █   █ █ █▄▄▄▄▄█  █");
        System.out.println("    █    █  █  █▄█  █  ▄    █  █ █  █    ▄▄  █      █ █   █ █▄▄▄▄▄  █▄▄█");
        System.out.println("    █    █▄▄█       █ █ █   █  █▄▄█ █   █  █ █  ▄   █ █   █  ▄▄▄▄▄█ █▄▄ ");
        System.out.println("    █▄▄▄▄▄▄▄█▄▄▄▄▄▄▄█▄█  █▄▄█▄▄▄▄▄▄▄█▄▄▄█  █▄█▄█ █▄▄█ █▄▄▄█ █▄▄▄▄▄▄▄█▄▄█");
        System.out.println("");
        System.out.println("***************************************************************************");

    }
}
