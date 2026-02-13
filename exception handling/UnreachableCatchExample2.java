package exceptionHandling;
import java.io.IOException;

public class UnreachableCatchExample2 {

	 public static void main(String[] args) {

	        try {
	            int a = 10 + 20;   // No IOException here
	        }

	        catch (IOException e) {   // ❌ Compile-time error
	            System.out.println("IOException caught");
	        }
	    }
}
