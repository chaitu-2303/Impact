package BasicJava.Day10;

import java.util.Scanner;

public class AddTwoNumbers {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of the second array: ");
        int m = sc.nextInt();


        int arr1[] = new int[n];
        int arr2[] = new int[m];
        System.out.print("Enter the elements of the first array: ");
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the elements of the second array: ");
        for(int j = 0; j < m; j++){
            arr2[j] = sc.nextInt();
        }   
        int result1 = 0;
        int result2 = 0;
        for(int i = 0; i < n; i++){
            result1=(result1*10)+arr1[i];
        }
        for()
        sc.close();
    }
}