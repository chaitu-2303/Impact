package BasicJava.Day8;

import java.util.Scanner;

public class BusStop 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
         }
    int bus = 1;
    int sum = 0;
    for(int i = 0; i < n; i++)
    {
        if(sum + arr[i] <= m)
        {
            sum += arr[i];
        }
        else
        {
            sum = arr[i];
            bus++;
        }
    }
    System.out.println(bus);
    }
}