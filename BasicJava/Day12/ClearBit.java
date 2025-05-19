import java.util.Scanner;

public class ClearBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();

        if((n&~(1 << i)) == 0){
            System.out.println("It is ClearBit");
        }
        else{
            System.out.println("It is not ClearBit");
        }
    }
}
