package BasicJava.Day13;

import java.util.Scanner;

public class NumberVowelsInStrin {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++){
            if (s.charAt(i) == 'A' || s.charAt(i) ==  'E'|| s.charAt(i) ==  'I'||s.charAt(i) ==  'O'||s.charAt(i) ==  'U' || s.charAt(i) == 'a' ||s.charAt(i) ==  'e' ||s.charAt(i) ==  'i' ||s.charAt(i) ==  'o' ||s.charAt(i) ==  'u'){
                count++;
            }
        }
        System.out.println("Number of vowels: " + count );
    }
}
