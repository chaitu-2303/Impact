import java.util.Scanner;

public class Oddnumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        try 
        {
            int n = sc.nextInt();
            if (n % 2 != 0) 
            {
                System.out.println("This is a odd number.");
            } 
            else 
            {
                throw new Exception("This is not a odd number.");
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        } 
        finally 
        {
            sc.close(); 
        }
    }
}
