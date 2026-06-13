import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount:");
        double amount = sc.nextDouble();
        System.out.println("Select Conversion:");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        int choice = sc.nextInt();
        double result = 0;
        switch(choice){
            case 1:
                result = amount * 0.012;
                System.out.println("USD = " + result);
                break;
            case 2:
                result = amount * 83.0;
                System.out.println("INR = " + result);
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}


