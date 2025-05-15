package BasicJava.Day3;

import java.util.Scanner;

public class Manuplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        while(n!= 0){

            int r = n % 10;
            if(r == m){
                count++;
            }
            n = n / 10;
        }        
        System.out.println(count);   
     }
}