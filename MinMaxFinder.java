import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the integers
        int[] numbers = new int[10];

        // Prompt the user to input ten integers
        System.out.println("Enter ten integers:");

        // Read integers from the user and store them in the array
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find the smallest and largest values in the array
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the smallest and largest values
        System.out.println("Smallest value: " + min);
        System.out.println("Largest value: " + max);

        // Close the scanner
        scanner.close();
    }
}
