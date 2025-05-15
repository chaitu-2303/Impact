package BasicJava.Day3;

import java.util.Scanner;

public class DivisibleBtwRange {
    public static  void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int start = sc.nextInt();
        System.out.println("Enter the second number: ");
        int end = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();

        System.out.println("Numbers divisible by  both 7 and 9:" + " " + start + " and " + end );
        for (int i = start; i <= divisor; i++) {
            if (i == start && i % divisor == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
