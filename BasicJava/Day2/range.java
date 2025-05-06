import java.util.Scanner;



public class range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n / 2 == 2 && n /2 == 4  ) {
            System.out.println("Not Wired");
        } else {
            System.out.println("Wired");
        }
    }
}
