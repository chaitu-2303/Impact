package BasicJava.Day8;

import java.util.Scanner;

public class HeightAndWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2 * n]; 
        for (int i = 0; i < 2 * n; i++) { 
            arr[i] = sc.nextInt();
        }
        int maxHeight = 0;
        int maxWeight = 0;
        int maxHeightPerson = -1;
        int maxWeightPerson = -1;
        for (int j = 0; j < 2 * n; j += 2) { 
            int currentHeight = arr[j];
            int currentWeight = arr[j + 1]; 

            if (currentHeight > maxHeight) {
                maxHeight = currentHeight;
                maxHeightPerson = (j / 2) + 1;
            }
            if (currentWeight > maxWeight) {
                maxWeight = currentWeight;
                maxWeightPerson = (j / 2) + 1;
            }
        }
        System.out.println("The Person with Max Height : "  + maxHeightPerson);
        System.out.println("The Person with Max Weight : "  + maxWeightPerson);
        sc.close();
    }
}
