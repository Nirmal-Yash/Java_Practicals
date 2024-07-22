public class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}
public class Calculator {
    public static int divide(int dividend, int divisor) throws DivideByZeroException {
        if (divisor == 0) {
            throw new DivideByZeroException("Divisor cannot be zero.");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            int result = divide(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (DivideByZeroException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
