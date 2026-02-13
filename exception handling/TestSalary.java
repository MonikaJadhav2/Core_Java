package exceptionHandling;

public class TestSalary {

	static void checkSalary(double salary) throws InvalidSalaryException {
        if (salary < 10000) {
            throw new InvalidSalaryException("Salary is too low");
        }
    }

    public static void main(String[] args) {
        try {
            checkSalary(5000);
        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}
