import java.util.Scanner;

public class CalculatorUsingMethods {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Addition = "
                + add(firstNumber, secondNumber));

        System.out.println("Subtraction = "
                + subtract(firstNumber, secondNumber));

        System.out.println("Multiplication = "
                + multiply(firstNumber, secondNumber));

        if (secondNumber != 0) {
            System.out.println("Division = "
                    + divide(firstNumber, secondNumber));
        } else {
            System.out.println("Cannot divide by zero");
        }

        scanner.close();
    }
}