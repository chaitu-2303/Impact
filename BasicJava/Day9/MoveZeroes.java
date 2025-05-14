package BasicJava.Day9;

import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            long num = sc.nextLong();

            int ones = 0, zeroes = 0;

            
            while (num > 0) {
                long digit = num % 10;
                if (digit == 1) ones++;
                else if (digit == 0) zeroes++;
                num /= 10;
            }

            
            long result = 0;
            for (int i = 0; i < ones; i++) {
                result = result * 10 + 1;
            }
            for (int i = 0; i < zeroes; i++) {
                result = result * 10;
            }

            System.out.println(result);
        }

        sc.close();
    }
}