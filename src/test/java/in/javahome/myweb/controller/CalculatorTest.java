package in.javahome.myweb.controller;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(30, cal.add(10, 20));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(200, cal.multiply(10, 20));
    }
}
