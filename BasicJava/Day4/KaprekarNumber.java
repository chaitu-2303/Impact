package BasicJava.Day4;

import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int count = 0;
        int sq = n * n;
        int temp = n;
        while(n != 0) {
            n /= 10;
            count++;
        }
        int power = (int) Math.pow(10, count);
        int left = sq % power;
        int right = sq / power;
        int sum = left + right;
        if (sum == temp) {
            System.out.println(temp + " is a Kaprekar number.");
        } else {
            System.out.println(temp + " is not a Kaprekar number.");
        }
        scanner.close();
    }
}