import java.util.ArrayList;

public class Accountant {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        Employee employee1 = new Programmer("Олег Давыдов", 1, 4000, "Программист", 150);
        Employee employee2 = new Manager("Андрей Орёл", 2, 3500, "Программист", 130);

        employees.add(employee1);
        employees.add(employee2);

        for (Employee emp : employees) {
            System.out.println(emp);
            System.out.println("Зарплата за этот месяц: " + emp.getSalary());
        }
    }
}
