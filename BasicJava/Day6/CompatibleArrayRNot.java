package BasicJava.Day6;

import java.util.Scanner;

public class CompatibleArrayRNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int j = 0; j < n2; j++){
            arr2[j] = sc.nextInt();
        }
        for(int k = 0; k < n1; k++){
            if(arr1[k] >= arr2[k]){
                System.out.println("Compatible");
            }else{
                System.out.println("Not Compatible");
            }
        }
    }
}

