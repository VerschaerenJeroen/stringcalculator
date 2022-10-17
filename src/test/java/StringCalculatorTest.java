import bignited.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void emptyStringInput() {
        StringCalculator calculator = new StringCalculator("");
        assertEquals(0, calculator.add());
    }

    @Test
    public void oneNumberStringInput() {
        StringCalculator calculator = new StringCalculator("1");
        assertEquals(1, calculator.add());
    }

    @Test
    public void seperatorStringInput() {
        StringCalculator calculator = new StringCalculator("1,2");
        assertEquals(3, calculator.add());
    }

    @Test(expected = Exception.class)
    public void negativeNumberStringInput() throws Exception {
        StringCalculator calculator = new StringCalculator("1,-2");
        calculator.add();
    }

    @Test
    public void numberBiggerThan1000StringInput() {
        StringCalculator calculator = new StringCalculator("1,1000,2");
        assertEquals(3, calculator.add());
    }
}
