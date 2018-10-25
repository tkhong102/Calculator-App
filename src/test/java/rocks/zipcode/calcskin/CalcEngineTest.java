package rocks.zipcode.calcskin;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcEngineTest {
    CalcEngine testCalc;

    @Before
    public void setUp() throws Exception {
        this.testCalc = new CalcEngine();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        Assert.assertTrue("", (testCalc.add(1.0, 1.0) == 2.0));
    }

    @Test
    public void subtract() {
        Assert.assertTrue("", (testCalc.subtract(17.0, 13.0) == 4.0));
    }

    @Test
    public void multiply() {
        Assert.assertTrue("", (testCalc.multiply(8.0, 3.0) == 24.0));
    }

    @Test
    public void divide() {
        Assert.assertTrue("", (testCalc.divide(10.0, 2.0) == 5.0));
    }
}