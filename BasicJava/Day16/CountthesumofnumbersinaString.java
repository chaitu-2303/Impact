package BasicJava.Day16;

import java.util.Scanner;

public class CountthesumofnumbersinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		int sum = addNumbers(string);
		System.out.println(sum);
	}

	public static int addNumbers(String string) {
		int sum = 0;
		int number = 0;
		boolean isNumber = false;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (Character.isDigit(ch)) {
				number = number * 10 + (ch - '0');
				isNumber = true;
			} else if (isNumber) {
				sum += number;
				number = 0;
				isNumber = false;
			}
		}
		if (isNumber) {
			sum += number;
		}
		return sum;
	}
}