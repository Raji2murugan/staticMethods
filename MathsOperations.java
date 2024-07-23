package staticassignment;

/**
 * 2. Write a program to calculate Math operations with Math contents initialized in static block.
 */

public class MathsOperations {

    private static int number1;
    private static int number2;

    static {
        number1 = 10;
        number2 = 5;
    }

    public static void main(String[] args) {
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        int sum1=adds();// without arguments

        int sum = add(number1, number2);// with arguments
        int difference = subtract(number1, number2);
        int product = multiply(number1, number2);
        int quotient = divide(number1, number2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }

    private static int adds() {
		// TODO Auto-generated method stub
		return number1+number2;
	}

	private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
        }
		return b;
    }
}
