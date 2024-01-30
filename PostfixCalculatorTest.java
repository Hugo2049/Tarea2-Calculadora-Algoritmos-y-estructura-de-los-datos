
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PostfixCalculatorTest {

    @Test
    public void testEvaluateSimpleExpression() {
        PostfixCalculator calculator = new PostfixCalculator();
        String expression = "3 4 +";
        int result = calculator.evaluate(expression);
        assertEquals(7, result);
    }

    @Test
    public void testEvaluateComplexExpression() {
        PostfixCalculator calculator = new PostfixCalculator();
        String expression = "5 1 2 + 4 * + 3 -";
        int result = calculator.evaluate(expression);
        assertEquals(14, result);
    }

    @Test
    public void testEvaluateDivision() {
        PostfixCalculator calculator = new PostfixCalculator();
        String expression = "7 2 /";
        int result = calculator.evaluate(expression);
        assertEquals(3, result);
    }

    @Test
    public void testEvaluateWithNegativeNumbers() {
        PostfixCalculator calculator = new PostfixCalculator();
        String expression = "9 8 +";
        int result = calculator.evaluate(expression);
        assertEquals(17, result);
    }
}

