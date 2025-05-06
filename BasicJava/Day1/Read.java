import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n % 100;
        int b = (n / 100) % 10;
        int c = n % 10;
        

        System.out.println(a + b + c);
        sc.close();
        }
    
}
