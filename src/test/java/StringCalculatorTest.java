import bignited.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void emptyStringInput() {
        StringCalculator calculator = new StringCalculator("");
        assertEquals(0, calculator.calculate());
    }

    @Test
    public void oneNumberStringInput() {
        StringCalculator calculator = new StringCalculator("1");
        assertEquals(1, calculator.calculate());
    }
}
