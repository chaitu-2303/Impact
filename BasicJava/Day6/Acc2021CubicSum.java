package BasicJava.Day6;

import java.util.Scanner;

public class Acc2021CubicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int x = 1;
            int y = arr[i]; 
            while (x <= y) {
                int z = (int) (Math.pow(x, 3) + Math.pow(y, 3));
                if (z == arr[i]) {
                    count++;
                    break; 
                } else if (z > arr[i]) {
                    y--;
                } else {
                    x++; 
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}