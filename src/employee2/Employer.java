package employee2;

import employee.Employee;

public class Employer {
    public static void main(String[] args) {
        Employee emp = new Employee("Gmina", 12345, 100000);
        emp.showId();
        emp.showSalary();
        emp.showSurname();
    }
}