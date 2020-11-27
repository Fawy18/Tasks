import static org.junit.Assert.*;

public class AccountantTest {

    @org.junit.Test
    public void main() {
        Employee employeeQ = new Manager("Тест", 100,3500, "Manager", 100);
        Employee employeeE = new Manager("Тест", 150,3500, "Manager", 200);
        Employee employeeD = new Programmer("Тест", 170,4000, "Programmer", 190);
        assertEquals(2170,employeeQ.getSalary());
        assertEquals(3500,employeeE.getSalary());
        assertEquals(4720,employeeD.getSalary());
    }
}