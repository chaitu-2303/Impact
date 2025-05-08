package BasicJava.Day4;

import java.util.Scanner;
public class Pattren {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= n-1; i++)
            {
                for(int j = i; j <= n; j++)
                    {
                        System.out.print(" * ");
                    }
                    System.out.println();
            }       
    }
}