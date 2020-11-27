public class Manager extends Employee {

    public Manager(String n, int i_d, int s, String t, int h) {
        super(n, i_d, s, t, h);
    }

    @Override
    public int getSalary() {
        if (getWorkHours() < fix_work_hours) {
            return getFixSalary() * getPercent() / 100;
        }
        else {
            return getFixSalary();
        }
    }
}
