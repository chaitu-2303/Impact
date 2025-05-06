import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.print(sum);
        scanner.close();
    }
}
