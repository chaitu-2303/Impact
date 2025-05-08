package BasicJava.Day3;

import java.util.Scanner;

public class AdamNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sq = n * n;
        int rev = 0;
        while (n != 0) {
            int r = n % 10;
            rev = (rev * 10 + r);
            n = n / 10; 
        }
        int revsq = rev * rev;
        int revsqrev = 0;
        while (revsq != 0) {
            int r = revsq % 10;
            revsqrev = (revsqrev * 10 + r);
            revsq = revsq / 10; 
        }
        if (sq == revsqrev) {
            System.out.println("Adam Number");
        } else {
            System.out.println("Not an Adam Number");
        }
    }
}