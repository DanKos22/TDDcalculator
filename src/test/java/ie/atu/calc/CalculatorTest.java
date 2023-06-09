package ie.atu.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;

    @Test
    public void testAdd()
    {
        myCalc = new Calculator();
        assertEquals(40,myCalc.add(20, 20));
    }

    @Test
    public void testMultiply()
    {
        myCalc = new Calculator();
        assertEquals(100,myCalc.multiply(10, 10));
    }

    @Test
    public void testSubtract()
    {
        myCalc = new Calculator();
        assertEquals(15,myCalc.subtract(30, 15));
    }

    @Test
    public void testDivide()
    {
        myCalc = new Calculator();
        assertEquals(5,myCalc.divide(50, 10));
    }
}
