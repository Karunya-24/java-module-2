public class ArithmeticExceptionDemo {

    public static void main(String[] args) {

        try {

            int firstNumber = 20;
            int secondNumber = 0;

            int result = firstNumber / secondNumber;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println(
                    "Error: Cannot divide by zero");
        }
    }
}