import java.util.Scanner;

public class Singledigit 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single-digit number: ");
        int n = scanner.nextInt();
        scanner.close();


        if (n == 0){
            System.out.println("The number is zero.");
            return;
        } 
        else if (n < 0 || n > 9) {
            System.out.println("Invalid input. Please enter a single-digit number.");
            return;
        }
        else if (n/2 <= 0) {    
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
         
    }

}
