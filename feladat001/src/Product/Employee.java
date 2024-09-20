package Product;

import java.util.Scanner;

public class Employee {
    String name = "";
    Double salary = 0.0;


    public void setName() {
        System.out.print("Enter name: ");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
    }
    public String getName() {
        return name;
    }

    public void setSalary() {
        System.out.print("Enter salary: ");
        Scanner scanner = new Scanner(System.in);
        this.salary = scanner.nextDouble();
        scanner.close();
    }

    public String getSalary() {
        return salary.toString();
    }
}
