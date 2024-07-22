
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = 0;
        do {
            try {
                number = input.nextInt();
                if(number != -1) {
                    System.out.println("You entered: " + number + ", enter another numbaer (-1 exit)");
                } else {
                    System.out.println("Program exited.");
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Please enter only a number: ");
                input.nextInt();
            }
        } while (number != -1);
    }
}