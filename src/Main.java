import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth month (integer 1 - 12 inclusive): ");
        int birthMonth = scanner.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

        scanner.close();
    }
}
