package employee;

public class Employee {
    public String surname;
    int id;
    private final int salary;

    Employee(int id, String surname, int salary) {
        this(surname, id, salary);
    }

    private Employee(int salary, int id, String surname) {
        this(surname, id, salary);
    }

    public Employee(String surname, int id, int salary) {
        this.surname = surname;
        this.id = id;
        this.salary = salary;
    }

    public void showSalary() {
        System.out.println("Employee Salary is: " + salary);
    }

    public void showSurname() {
        System.out.println("Employee Surname is: " + surname);
    }

    public void showId() {
        System.out.println("Employee id is: " + id);
    }
}