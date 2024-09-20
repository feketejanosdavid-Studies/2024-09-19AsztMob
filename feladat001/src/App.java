import Product.*;

public class App {
    public static void main(String[] args) throws Exception {

        Employee employee = new Employee();
        employee.setName();
        employee.setSalary();

        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
    }
}
