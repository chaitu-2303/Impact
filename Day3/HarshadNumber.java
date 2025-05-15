package Day3;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (n!= 0) {
            int r = n % 10;
            sum += r;
            n /= 10;
        }
        if(temp%sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    } 
}