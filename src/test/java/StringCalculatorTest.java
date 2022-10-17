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

    @Test
    public void seperatorStringInput2() {
        StringCalculator calculator = new StringCalculator("1,2,3,4");
        assertEquals(10, calculator.add());
    }

    @Test
    public void negativeNumberStringInput() {
        try {
            StringCalculator calculator = new StringCalculator("1,-2");
        } catch (IllegalArgumentException exception) {
            assertEquals("numberNotAllowed", exception.getMessage());
        }

    }

    @Test
    public void numberBiggerThan1000StringInput() {
        StringCalculator calculator = new StringCalculator("1,1000,2");
        assertEquals(3, calculator.add());
    }
}
