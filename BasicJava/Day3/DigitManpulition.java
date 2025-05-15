package BasicJava.Day3;

import java.util.Scanner;

public class DigitManpulition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 8; i++) {
            int d = n % 10;
            n = n / 10;
            System.out.println(d);
        }
    }
}
