package throwPg;

import java.util.Scanner;

public class AgeValidator {

    // Method that throws an exception
    public static void checkAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("Age cannot be negative.");
        } else if (age < 18) {
            throw new AgeException("Age must be 18 or older.");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        
        try {
            int age = scanner.nextInt();
            checkAge(age); // Call method that may throw an exception
        } catch (AgeException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
