package BasicJava.Day4;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal Number:");
        int n = sc.nextInt();
        int binaryNumber = 0;
        int rev = 1;

        while (n > 0) {
            int r = n % 2;
            binaryNumber += r * rev;
            rev *= 10;
            n /= 2;
        }

        sc.close();
        System.out.println("Binary Number is: " + binaryNumber);
    }
}
