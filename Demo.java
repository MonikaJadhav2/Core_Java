package monika;

public class Demo {
	
	public static void main(String[] args) {
		
		String str = "Monika";
		int count= 0;
		
		char [] ch = str.toCharArray();
		
		
//		for each loop
		for(char c: ch) {
			count++;
		}
		
		System.out.println("number of charcters: " + count);
	}

}
