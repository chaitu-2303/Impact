import java.util.Scanner;

public class HotelTariffCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int rentPerDay = scanner.nextInt();
        int numberOfDays = scanner.nextInt();
        scanner.close();

        if (month < 1 || month > 12) {
            System.out.println("Invalid Input");
            return;
        }else if (month < 3 && month >= 6  || month < 10 && month >= 12) {
            System.out.println("Invalid Input");
            return;
    }
        

        double finalRent = rentPerDay;
    
        if (month > 3 && month <= 6 || month < 10 && month >= 12) {
            finalRent *= 1.2; 
        }

        int totalTariff = (int)(finalRent * numberOfDays);
        System.out.println(totalTariff);
    }
}
