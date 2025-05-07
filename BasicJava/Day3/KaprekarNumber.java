package BasicJava.Day3;

import java.util.Scanner;

public class KaprekarNumber {
    public static boolean isKaprekar(int num) {
        int square = num * num;
        String strNum = String.valueOf(square);
        int len = strNum.length();
        int rightPart = Integer.parseInt(strNum.substring(len - String.valueOf(num).length()));
        int leftPart = (len > String.valueOf(num).length()) ? Integer.parseInt(strNum.substring(0, len - String.valueOf(num).length())) : 0;

        return (leftPart + rightPart == num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isKaprekar(num)) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }
    }
}
