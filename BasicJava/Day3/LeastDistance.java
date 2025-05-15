package BasicJava.Day3;

import java.util.Scanner;
public class LeastDistance{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int m = sc.nextInt();
        
        int a = num/m;
        int upper = a * m;
        int lower = (a+1)*m;
        if (num - upper < lower - num){
            System.out.println(upper);
        }else if (num - upper > lower - num){
            System.out.println(lower);
        }else{
            System.out.println(lower);
        }
        sc.close();
         
    }

}
