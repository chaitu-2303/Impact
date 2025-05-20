import java.util.Scanner;

public class FindnonRepeacting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            count ^= arr[i];
        }
        System.out.println("The Non Repited Number is " + count);
    }
}
