import java.util.Scanner;

public class CollatzSequence  
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            for (int i = 0; i < 10; i++) {
                System.out.print(n + " ");
                if (n == 1) {
                    break;
                } else if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
            }
        }
    }

}