import java.util.Scanner;

class Division
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            System.err.print("Enter num : ");
            int num = sc.nextInt();
            System.out.print("Enter den : ");
            int den = sc.nextInt();
            int result = num / den;
            System.out.println("Result : " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }
        catch (Exception e)
        {
            System.out.println("Error occurred." + e.getMessage());
        }
        finally
        {
            System.err.println("Division operation completed.");
            sc.close();
        }
    }
}