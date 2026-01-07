package exceptionHandling;

public class ArithematicExceptionDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b= 0;
		
		try {
			
			int result = a/b;
			System.out.println("Result  = " +result);
		}
		
		catch(ArithmeticException e) {
			
			 System.out.println("Exception occurred: Division by zero is not allowed.");
		}
		
		finally {
			System.out.println("I am finally block here: which will execute every time");
		}
	}
}
