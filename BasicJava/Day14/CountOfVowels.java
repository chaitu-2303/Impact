package BasicJava.Day14;

import java.util.Scanner;

public class CountOfVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Alphbet : ");
        String s = sc.nextLine();
        String alphbet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < alphbet.length(); i++){
            char ch = alphbet.charAt(i);
            if(s.indexOf(ch) == -1){
                System.out.print(ch);
            }
        }
    }
}
