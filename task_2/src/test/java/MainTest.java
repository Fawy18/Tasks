import static org.junit.Assert.*;

public class MainTest extends Main {

    @org.junit.Test
    public void mainTest() {

        assertEquals("o*o*o", interviewRecursionTest("ooo"));
        assertEquals("ddd", interviewRecursionTest("ddd"));
        assertEquals("E*a*A*e", interviewRecursionTest("EaAe"));
        assertEquals("A*D*A*D*A*D", interviewRecursionTest("ADADAD"));
    }
}