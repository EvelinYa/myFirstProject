package employee;

public class Employer {
    public static void main(String[] args) {
        System.out.println("First employee");
        Employee emp = new Employee("Gmina", 12345, 130000);
        emp.showId();
        emp.showSalary();
        emp.showSurname();

        System.out.println();
        System.out.println("Second employee");
        Employee emp2 = new Employee(23456, "Dziabczyk", 75000);
        emp2.showId();
        emp2.showSalary();
        emp2.showSurname();
    }
}