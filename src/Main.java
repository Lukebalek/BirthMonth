import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birth month
        System.out.print("Enter your birth month (integer 1 - 12 inclusive): ");
        int birthMonth = scanner.nextInt();

        // Check if the entered value is in the valid range (1 to 12)
        if (birthMonth >= 1 && birthMonth <= 12) {
            // Valid input, echo the input
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            // Invalid input, display an error message
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

        scanner.close();
    }
}
