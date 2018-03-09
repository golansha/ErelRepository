import java.util.Random;
import java.util.Scanner;

public class PickAndGuess {
    private static int maxTries = 10;
    private static int maxNum = 100;
    private static String quit = "a";
    public static void main(String[] args) {
        int tries = 0;
        System.out.println("Hellow\n" +
                "Welcom to my game 'Pick and Guess'\n" +
                "At my game, the computer will pick a number and you will have to guess it\n" +
                "You have only " + maxTries + " tries to guess the number\n" +
                "If you want to quit press " + quit + "\n" +
                "If not press 1\n" +
                "The number will be between 1 and " + maxNum + "\n" +
                "Good luck");
        Scanner scanner = new Scanner(System.in);
        String wannaQuit = scanner.nextLine();
        while (!wannaQuit.equals(quit)) {
            tries = 0;
            int answer = 1;
            int n = 0;
            Random rand = new Random();
            n = rand.nextInt(maxNum) + 1;
            while (!(tries == maxTries || answer == n)) {
                    tries = tries + 1;
                    System.out.println("What is the Num?");
                    answer = scanner.nextInt();
                    scanner.nextLine();
                    if (answer > n) {
                        System.out.println(answer + " > Num");
                    }
                    if (answer < n) {
                        System.out.println(answer + " < Num");
                    }
                    if (answer == n) {
                        System.out.println("Congratulation!\n" +
                                "If you want to quit press a");
                    } else {
                        System.out.println("Try again");
                    }
            }
            if (tries == maxTries) {
                System.out.println("Game Over\n" +
                        "Try again");

            }
            System.out.println("Do you want to quit?");
            wannaQuit = scanner.nextLine();
        }
    }
}
