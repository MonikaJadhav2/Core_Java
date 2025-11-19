
public class EvenOddLoops {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.println(i + " is Even.");
			}
			else {
				System.err.println(i + " is Odd.");
			}
		}
	}

}
