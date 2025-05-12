package BasicJava.Day6;

import java.util.Scanner;

public class NamePattern {
    public static void printPattern(int n) {
        char[] letters = {'C', 'H', 'A', 'I'};
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(letters[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}