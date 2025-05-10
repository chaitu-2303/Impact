package BasicJava.Day6;

import java.util.Scanner;

public class InsertingCards 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        if (pos > size) {
            System.out.println("Invalid position");
        }else{
            int element = sc.nextInt();
            for(int i = 0; i < size; i++){
                if(i == pos - 1){
                    System.out.println(element);
                }
                System.out.println(arr[i]);
            }
        }    
    }
}
