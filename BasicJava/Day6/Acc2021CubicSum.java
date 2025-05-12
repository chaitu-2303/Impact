package BasicJava.Day6;

import java.util.Scanner;

public class Acc2021CubicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (isSumOfTwoCubes(arr[i])) {
                System.out.println(arr[i] + " is a good integer");
            } else {
                System.out.println(arr[i] + " is not a good integer");
            }
        }
        sc.close();
    }

    static boolean isSumOfTwoCubes(int num) {
        for (int x = 1; x * x * x <= num; x++) {
            int yCube = num - x * x * x;
            if (yCube > 0) {
                int y = (int) Math.round(Math.cbrt(yCube));
                if (y * y * y == yCube) {
                    return true;
                }
            }
        }
        return false;
    }
}