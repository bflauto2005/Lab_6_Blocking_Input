import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(10) + 1;
        int guess = 0;
        boolean validInput;

        do{
            System.out.print("Pick a number between 1 and 10: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                if (guess >= 1 && guess <= 10) {
                    validInput = true;
                }else{
                    System.out.println("Invalid input: pick a number between 1 and 10!");
                    validInput = false;
                }
            }else{
                String trash = scanner.nextLine();
                System.out.println("Invalid input: " + trash);
                validInput = false;
            }
        }while (!validInput);

        System.out.println("Random number was: " + randomNum);
        if (guess < randomNum) {
            System.out.println("Your guess was too low!");
        }else if (guess > randomNum){
            System.out.println("Your guess is too high!");
        }else {
            System.out.println("Your guess is on the money!");
        }
    }
}
