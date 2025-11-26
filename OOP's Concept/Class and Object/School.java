import com.oops.Student1;

public class School {
	public static void main(String[] args) {
		Student1 s = new Student1();
		Student1 s1 = new Student1();

		System.out.println("Default values of s:");
		System.out.println("Name: " + s.name);
		System.out.println("ID: " + s.id); 
		System.out.println("Grade: " + s.grade);

		System.out.println("------------------------");

		// Assigning values to first object
		s.name = "Monika";
		s.id = 101;
		s.grade = 'A';

		// Assigning values to second object
		s1.name = "Komal";
		s1.id = 102;
		s1.grade = 'B';

		// Printing updated values
		System.out.println("Updated values of s:");
		System.out.println("Name: " + s.name);
		System.out.println("ID: " + s.id);
		System.out.println("Grade: " + s.grade);

		System.out.println("------------------------");

		System.out.println("Values of s1:");
		System.out.println("Name: " + s1.name);
		System.out.println("ID: " + s1.id);
		System.out.println("Grade: " + s1.grade);
	}
}
