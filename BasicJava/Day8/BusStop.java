package BasicJava.Day8;

import java.util.Scanner;

public class BusStop 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int m=in.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=in.nextInt();
         }
    int bus=1;
    int sum=0;
    for(int i=0;i<num;i++)
    {
        if(sum+arr[i]<=m)
        {
            sum+=arr[i];
        }
        else
        {
            sum=arr[i];
            bus++;
        }
    }
    System.out.println(bus);
    }
}
