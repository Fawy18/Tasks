public abstract class Employee {

    protected String name;
    protected int id;
    protected int fix_salary;
    protected String type;
    protected int fix_work_hours = 160;
    protected int work_hours;

    public Employee(String n, int i_d, int s, String t, int h) {
        name = n;
        id = i_d;
        fix_salary = s;
        type = t;
        work_hours = h;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getFixSalary() {
        return fix_salary;
    }

    public String getType() {
        return type;
    }

    public int getWorkHours() {
        return work_hours;
    }

    public int getPercent() {
        return work_hours * 100 / fix_work_hours;
    }

    public abstract int getSalary();

    @Override
    public String toString() {
        return "Employee [employeeId=" + id
                + ", employeeName=" + name
                + ", employeeType=" + type
                + ", employeeWorkHours=" + work_hours + ", employeeFixSalary=" + fix_salary +"]";
    }
}
