

import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Get the starting and ending numbers
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Print odd numbers between start and end
        System.out.println("Odd numbers between " + start + " and " + end + " are:");
        
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
