
package TECHNICAL_S3par1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimeComparison comparison = new TimeComparison();

        boolean continueComparison = true;

        while (continueComparison) {
            // Input first time
            System.out.println("Enter the first time:");
            System.out.print("Hours (0-23): ");
            int hours1 = scanner.nextInt();
            System.out.print("Minutes (0-59): ");
            int minutes1 = scanner.nextInt();
            System.out.print("Seconds (0-59): ");
            int seconds1 = scanner.nextInt();

            // Input second time
            System.out.println("Enter the second time:");
            System.out.print("Hours (0-23): ");
            int hours2 = scanner.nextInt();
            System.out.print("Minutes (0-59): ");
            int minutes2 = scanner.nextInt();
            System.out.print("Seconds (0-59): ");
            int seconds2 = scanner.nextInt();

            // Create Time objects
            Time t1 = new Time(hours1, minutes1, seconds1);
            Time t2 = new Time(hours2, minutes2, seconds2);

            // Compare the times
            System.out.println("\nComparison Results:");
            if (comparison.isGreater(t1, t2)) {
                System.out.println("The first time is greater than the second time.");
            } else if (comparison.isLess(t1, t2)) {
                System.out.println("The first time is less than the second time.");
            } else if (comparison.isEqual(t1, t2)) {
                System.out.println("Both times are equal.");
            }

            // Calculate and display the difference
            int differenceInSeconds = t1.differenceInSeconds(t2);
            int hoursDiff = differenceInSeconds / 3600;
            int minutesDiff = (differenceInSeconds % 3600) / 60;
            int secondsDiff = differenceInSeconds % 60;

            System.out.printf("The difference between the two times is %d hours, %d minutes, and %d seconds.\n",
                    hoursDiff, minutesDiff, secondsDiff);

            // Ask if the user wants to continue
            System.out.print("\nDo you want to compare another pair of times? (yes/no): ");
            String response = scanner.next();
            continueComparison = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for using the Time Comparison Program!");
        scanner.close();
    }
}