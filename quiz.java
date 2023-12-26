import java.util.Scanner;
import java.util.Random;

/**
 * quiz
 */
public class quiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Guess the number (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
                if (answer < number) {
                    System.out.println("Wrong answer. Try again.");
                } else if (answer > number) {
                    System.out.println("Close enough. Try again.");
                } else {
                    success = true;
                    System.out.println("Congratuations! your guess is correct");
                }

            } while (!success);
            System.out.print("Do you want to repeat the game (Y/N) ");
            menu = input.next().charAt(0);
            input.nextLine();
        } while (menu == 'Y' || menu == 'y');
    }
}
