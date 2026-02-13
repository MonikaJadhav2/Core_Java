package exceptionHandling;


public class UnreachableCatchDemo {

	public static void main(String[] args) {

        try {
            int a = 10 / 0;
        }

        // Parent exception
        catch (Exception e) {
            System.out.println("Handled by Exception");
        }

        // Child exception (UNREACHABLE)
        catch (ArithmeticException e) {
            System.out.println("Handled by ArithmeticException");
        }
    }
}
