import java.util.Objects;
import java.util.Scanner;

public class Lab2 {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Count from a number to another");
            System.out.println("2. Determine largest number");
            System.out.println("3. Type in word");
            System.out.println("4. Quit");

            System.out.print("Enter option: ");
            choice = myScan.nextInt();
            System.out.println();

            if (choice == 1) {
                System.out.print("Enter the start point: ");
                int start = myScan.nextInt();

                System.out.print("Enter the end point: ");
                int end = myScan.nextInt();
                System.out.println("Counting from "+start+" to "+end+"...");
                if (Objects.equals(start, end)) {
                    System.out.println("Start and end are the same!");
                    
                }
                else if (start > end) {
                    for (int i=start; i>end; i--) {
                        System.out.println(i);
                    }
                }
                else {
                    for (int i=start; i<end; i++) {
                        System.out.println(i);
                    }
                }
                System.out.println("Done counting.");
            }

            if (choice == 2) {
                System.out.println("This option will display the largest number entered. Enter 0 when done.");
                int largest = 0;
                int newNum;

                do {
                    System.out.print("Enter a number (current largest is "+largest+"): ");
                    newNum = myScan.nextInt();
                    largest = Math.max(newNum, largest); 
                } while (newNum != 0);
                System.out.println("The largest number entered was "+largest);
            }

            if (choice == 3) {
                myScan.nextLine();
                System.out.print("Type in the word 'Computer: ");
                String answer = myScan.nextLine();
                while (!answer.equals("Computer")) {
                    System.out.print("Incorrect. You must type 'Computer': ");
                    answer = myScan.nextLine();
                }
                System.out.println("Correct!");
            }
        }
        System.out.println("Shutting off...");
        myScan.close();
    }


}
