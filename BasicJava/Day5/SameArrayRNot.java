package BasicJava.Day5;

import java.util.Scanner;;

public class SameArrayRNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter index: ");
        int m = sc1.nextInt();
        System.out.println("Enter the values: ");
        int arr2[] = new int[m];
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            sum1 += arr1[i];
            }
            for(int j = 0; j < m; j++){
                arr2[j] = sc.nextInt();
                sum2 += arr2[j];
            }    
            if(n == m) {
                if(sum1 == sum2) {
                System.out.println("same");
                }
                else {
                    System.out.println("not same");
                    }
                    
    }
} 
}      
