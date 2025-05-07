package BasicJava.Day3;

import java.util.Scanner;
public class LeastDistance{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int m = sc.nextInt();
        
        int a = num/m;
        int small = a * m;
        int large = small + m;
        if (num - small < large - num){
            System.out.println(small);
        }else if (num - small > large - num){
            System.out.println(large);
        }else{
            System.out.println(large);
        }
        sc.close();
         
    }

}
