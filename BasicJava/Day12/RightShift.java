import java.util.Scanner;

public class RightShift {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Right Shifted is:");
        for(int i = 0; i < n; i++){
            System.out.print((arr[i] >> 1) + " ");
        }
        System.out.println();
    }
    
}
