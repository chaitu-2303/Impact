import java.util.Scanner;

public class ThreeDigitReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();
        scanner.close();

        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
    }
    private static int reverseNumber(int n) {
        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int units = n % 10;
        return units * 100 + tens * 10 + hundreds;
    } 

}