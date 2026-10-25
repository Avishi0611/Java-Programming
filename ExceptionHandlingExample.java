// Program: Demonstrate the concept of Exception Handling in Java

import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        System.out.println("---- Exception Handling Example ----");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();

            System.out.print("Enter denominator: ");
            int den = sc.nextInt();

            int result = num / den;  // May cause ArithmeticException
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally {
            System.out.println("Execution of finally block (always runs).");
            sc.close();
        }

        System.out.println("Program continues normally after handling exception.");
    }
}
