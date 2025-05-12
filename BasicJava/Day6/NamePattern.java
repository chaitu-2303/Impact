package BasicJava.Day6;

import java.util.Scanner;

public class NamePattern {
     public static void printPattern(int n)
    {
        Scanner sc = new Scanner(System.in);
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}