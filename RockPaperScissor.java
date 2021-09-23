import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        int b = 0;
        // 0 for Rock, 1 for Paper, 2 for Scissor
        Scanner sc = new Scanner(System.in);
        while (b < 3) {
            b++;
            System.out.println("3 ROUNDS...Let's see who wins!");
            System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor \n ");
            int userInput = sc.nextInt();
            Random random = new Random();
            int computerInput = random.nextInt(3);

            if (userInput == computerInput) {
                System.out.println("Draw");
            } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                    || userInput == 2 && computerInput == 1) {
                System.out.println("You Win!");
            } else {
                System.out.println("Computer Win!");
            }
            // System.out.println("Computer choice: " + computerInput);
            if (computerInput == 0) {
                System.out.println("Computer choice: Rock");
            } else if (computerInput == 1) {
                System.out.println("Computer choice: Paper");
            } else {
                System.out.println("Computer choice: Scissors");
            }
        }
    }
}