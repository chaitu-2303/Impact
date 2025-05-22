import java.util.*;

public class CountOfSubsequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int c = 0;
		int d = 0;
		while(c<a.length()) {
			if(b.charAt(d)==a.charAt(c)) {
				d++;
				c++;
			}
			else {
				c++;
			}
		}
		if(d==b.length()) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}