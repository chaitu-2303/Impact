package BasicJava.Day3;

import java.util.Scanner;

public class AdamNumber {

    static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    static boolean isAdamNumber(int number) {
        int square = number * number;
        int reversedNumber = reverseNumber(number);
        int reversedSquare = reversedNumber * reversedNumber;
        int reversedSquareOfSquare = reverseNumber(square);

        return reversedSquareOfSquare == (reversedSquare);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isAdamNumber(number)) {
            System.out.println(number + " is an Adam number.");
        } else {
            System.out.println(number + " is not an Adam number.");
        }
    }
}