import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        int numSeats = 50;
        double ticketPrice = 30;
        double popcornPrice = 25;
        double sodaPrice = 10;
        double candyPrice = 15;
        double currentBalance = 0;
        int choice = 0;

        Scanner newScan = new Scanner(System.in);
        System.out.println("[Movie Theater Manager]");
        while (choice != 8) {
            System.out.println("1. Sell tickets");
            System.out.println("2. End movie session");
            System.out.println("3. Change ticket price");
            System.out.println("4. Sell confection");
            System.out.println("5. Change price of confection");
            System.out.println("6. View Balance");
            System.out.println("7. View prices");
            System.out.println("8. Quit");

            System.out.print("Enter option: ");
            choice = newScan.nextInt();
            System.out.println();

            if (choice == 1) {
                System.out.print("Sell how many tickets? ");
                int numToSell = newScan.nextInt();

                if (numToSell > numSeats) {
                    System.out.println("Unable to sell "+numToSell+" tickets: Only "+numSeats+" seats available.");
                }
                else {
                    currentBalance += ticketPrice*numToSell;
                    numSeats -= numToSell;
                    System.out.printf("Sold %d tickets at $%.2f for a total of $%.2f%n", numToSell, ticketPrice, (ticketPrice*numToSell));
                }
                System.out.println();
            }

            else if (choice == 2) {
                numSeats = 50;
                System.out.println("All seats have been vacated and cleaned");
                System.out.println();
            }

            else if (choice == 3) {
                System.out.print("Enter new ticket price: $");
                ticketPrice = newScan.nextDouble();
                System.out.println("Ticket price updated.");
                System.out.println();
            }

            else if (choice == 4) {
                System.out.println("Sell what confection?");
                System.out.println("1. Popcorn");
                System.out.println("2. Soda");
                System.out.println("3. Candy");
                int sellChoice = newScan.nextInt();

                if (sellChoice == 1) {
                    currentBalance += popcornPrice;
                    System.out.printf("Sold POPCORN for $%.2f%n", popcornPrice);
                }
                else if (sellChoice == 2) {
                    currentBalance += sodaPrice;
                    System.out.printf("Sold SODA for $%.2f%n", sodaPrice);
                }
                else if (sellChoice == 3) {
                    currentBalance += candyPrice;
                    System.out.printf("Sold CANDY for $%.2f%n", candyPrice);
                }
                System.out.println();
            }

            else if (choice == 5) {
                System.out.println("Change price of which confection?");
                System.out.println("1. Popcorn");
                System.out.println("2. Soda");
                System.out.println("3. Candy");
                int changeChoice = newScan.nextInt();
                if (changeChoice == 1) {
                    System.out.print("Enter new POPCORN price: $");
                    candyPrice = newScan.nextDouble();
                    System.out.println("POPCORN price updated.");
                }
                else if (changeChoice == 2) {
                    System.out.print("Enter new SODA price: $");
                    sodaPrice = newScan.nextDouble();
                    System.out.println("SODA price updated.");
                }
                else if (changeChoice == 3) {
                    System.out.print("Enter new CANDY price: $");
                    candyPrice = newScan.nextDouble();
                    System.out.println("CANDY price updated.");
                }
                System.out.println();
            }

            else if (choice == 6) {
                System.out.printf("Current balance is $%.2f%n", currentBalance);
                System.out.println();
            }

            else if (choice == 7) {
                String message = """
                        Current prices:
                        Ticket: $%.2f
                        Popcorn: $%.2f
                        Soda: $%.2f
                        Candy: $%.2f
                        """.formatted(ticketPrice, popcornPrice, sodaPrice, candyPrice);
                System.out.println(message);
                System.out.println();
            }
        }
        
        newScan.close();
        System.out.println("Shutting off...");
    }
    
}
