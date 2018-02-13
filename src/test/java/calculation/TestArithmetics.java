package calculation;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class TestArithmetics {
    private static Arithmetics arTest;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout timeout = new Timeout(1000);

    @BeforeClass
    public static void runTest() {
        arTest = new Arithmetics();
    }

    @Test
    public void add() {
        double res = arTest.add(3,7);
        Assert.assertTrue(res == 10);
    }

    @Ignore
    @Test
    public void deduct() {

        double res = arTest.deduct(10,5);
        Assert.assertFalse(res!=5);
    }

    @After
    @Test
    public void mult() {

        double res = arTest.mult(10,5);
        Assert.assertNotNull(res);
    }


    @Test
    public void div() {

        double res = arTest.div(10,5);
        Assert.assertFalse(res!=2);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivException() {
        arTest.div(10.0,0.0);
    }


    @Test
    public void TestN() {
        exp.expect(ArithmeticException.class);
        arTest.div(10.0,0.0);
        while (true) {}
    }


}