
import java.util.Scanner;

public class StockTradingPlatform {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int stockPrice = 500;
        int shares = 0;

        while (true) {
            System.out.println("\n1. View Stock");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Balance");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Stock Price: Rs. " + stockPrice);
            }

            else if (choice == 2) {
                System.out.print("Enter shares to buy: ");
                int qty = sc.nextInt();

                if (qty > 0 && qty * stockPrice <= balance) {
                    balance = balance - (qty * stockPrice);
                    shares = shares + qty;
                    System.out.println("Stock bought successfully!");
                } else {
                    System.out.println("Not enough balance or invalid quantity!");
                }
            }

            else if (choice == 3) {
                System.out.print("Enter shares to sell: ");
                int qty = sc.nextInt();

                if (qty > 0 && qty <= shares) {
                    balance = balance + (qty * stockPrice);
                    shares = shares - qty;
                    System.out.println("Stock sold successfully!");
                } else {
                    System.out.println("You don't have enough shares!");
                }
            }

            else if (choice == 4) {
                System.out.println("Balance: Rs. " + balance);
                System.out.println("Shares: " + shares);
                System.out.println("Stock Value: Rs. " + (shares * stockPrice));
                System.out.println("Total Portfolio: Rs. "
                        + (balance + shares * stockPrice));
            }

            else if (choice == 5) {
                System.out.println("Thank you!");
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
