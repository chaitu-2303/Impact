package BasicJava.Day13;

import java.util.Scanner;

public class ReadAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String st = sc.nextLine();
        System.out.print("Enter the String Char: ");
        char ch = sc.next().charAt(0);
        char [] chars = st.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == ch){
                count++;
            }
        }
        System.out.println("Number of '" + ch + "' in the string is: " + count);
    }
}
