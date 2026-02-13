package exceptionHandling;

public class InvalidSalaryException extends Exception {

	// Default Constructor
   // InvalidSalaryException() {
   //     super("Invalid Salary");
  //  }

    // Constructor with custom message
    InvalidSalaryException(String message) {
        super(message);
   }

    // Constructor with message and cause
    InvalidSalaryException(String message, Throwable cause) {
        super(message, cause);
    }
}
