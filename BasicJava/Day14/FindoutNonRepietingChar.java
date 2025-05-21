package BasicJava.Day14;

import java.util.*;

public class FindoutNonRepietingChar {
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.print("Enter a string : ");
         String s=scan.nextLine();
         int count=0;
         char c[]=new char[s.length()];
         for(int i=0;i<s.length();i++){
             c[i]=s.charAt(i);
         }
         for(int i=0;i<s.length();i++){
             count=0;
             for(int j=0;j<s.length();j++){
                if(c[i]==c[j]){
                    count=count+1;
                }
            }
            if(count==1){
                System.out.println(c[i]);
                 return;
            }
        }
        System.out.println("All the characters are repetitive : ");
    }
}            