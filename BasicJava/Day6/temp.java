package BasicJava.Day6;

import java.util.Scanner;

public class temp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++) 
        {
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            arr2[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(arr1[i] >= arr2[i])
            {
                count++;
            }
        }
        if(count == n)
        {
            System.out.println("Compatible");
        }else{
            System.out.println("Not Compatible");
        }
    }
}