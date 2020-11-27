public class Programmer extends Employee {

    public Programmer(String n, int i_d, int s, String t, int h) {
        super(n, i_d, s, t, h);
    }

    @Override
    public int getSalary() {
        return getFixSalary() * getPercent() / 100;
    }
}
