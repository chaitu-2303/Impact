import java.util.Scanner;
public class DoorUnlocker {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.close();
        
        int first_door = n/1000; 
        int second_door = n%10;
        System.out.println(first_door+ second_door); 
    }
}