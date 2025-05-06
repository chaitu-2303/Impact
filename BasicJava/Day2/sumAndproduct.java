import java.util.Scanner;
public class sumAndproduct 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int first_value = scanner.nextInt();
        int second_value = scanner.nextInt();
        scanner.close();
        
        for(int n = first_value; n <= second_value; n++)
        {
            int digit1 = n % 10;
            int digit2 = (n / 10) % 10;
            int sum = digit1 + digit2;
            int product = digit1 * digit2;
            if (sum + product == n) 
            {
                System.out.println(n);
            }
        }    
    }

}