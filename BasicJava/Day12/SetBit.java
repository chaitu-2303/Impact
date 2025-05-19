import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();

        if(((n >> i) & 1) == 1){
            System.out.println("It is SetBit");
        }
        else{
            System.out.println("It is not SetBit");
        }
    }
}