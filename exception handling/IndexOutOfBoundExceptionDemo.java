package exceptionHandling;

public class IndexOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		
		int arr[] = { 23, 24, 12, 13 };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("A : " + arr[i]);
		}

		
		try {

			arr[5] = 3;            //trying to access index grater than array size
 
		}
		
		catch (ArrayIndexOutOfBoundsException a) {
			
			System.out.println("Accessing invalid array index ");
		}
		
		System.out.println("program exeecution ended here.....!");
		
	}
}
