package exceptionHandling;

public class CatchOrderDemo {
	
    public static void main(String[] args) {
    	
        try {
        	
            int arr[] = new int[2];
            arr[5] = 10;
        } 
        
        catch (ArrayIndexOutOfBoundsException e) {
        	
            System.out.println("Array index error");
        } 
        
        catch (Exception e) {
        	
            System.out.println("General exception");
        }
    }
}
