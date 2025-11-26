import com.oops.Employee1;

public class Employee1_mainClass {

    public static void main(String[] args) {

        // First Employee
        Employee1 emp = new Employee1();
        emp.empName = "Om";
        emp.city = "Goa";
        emp.emp_Id = 123465;
        emp.salary = 350000.0;

        System.err.println("1st Employee Info ... !");
        System.out.println("Employee Name = " + emp.empName);
        System.out.println("Employee City = " + emp.city);
        System.out.println("Employee ID = " + emp.emp_Id);
        System.out.println("Employee Salary = " + emp.salary);
        System.out.println("Thank you ... !");

        System.out.println("-----------------------------");

        // Second Employee
        Employee1 emp1 = new Employee1();
        emp1.empName = "Ram";
        emp1.city = "Pune";
        emp1.emp_Id = 123464;
        emp1.salary = 500000.0;

        System.err.println("2nd Employee Info ... !");
        System.out.println("Employee Name = " + emp1.empName);
        System.out.println("Employee City = " + emp1.city);
        System.out.println("Employee ID = " + emp1.emp_Id);
        System.out.println("Employee Salary = " + emp1.salary);
        System.out.println("Thank you ... !");
    }
}
