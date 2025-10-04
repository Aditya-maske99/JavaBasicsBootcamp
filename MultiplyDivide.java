import java.util.Scanner;

public class MultiplyDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform multiplication
        double product = num1 * num2;
        System.out.println("Multiplication: " + product);

        // Perform division
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        scanner.close();
    }
}