import java.util.Scanner;

public class trendayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int n = scanner.nextInt();

       if (n <100 || n > 999) {
            System.out.println("Please enter a three-digit number.");
        } else {
            int secondDigit = (n / 10) % 10;

            if (secondDigit%3 == 0) {
                System.out.println("The number is a trenday number.");
            } else {
                System.out.println("The number is not a trenday number.");
            }
        }
        scanner.close();
    }
}
