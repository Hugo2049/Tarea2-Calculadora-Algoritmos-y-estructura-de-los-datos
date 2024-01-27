import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PostfixCalculatorTest {

    @Test
    void testEvaluateSimpleExpression() {
        PostfixCalculator calculator = new PostfixCalculator();
        String expression = "3 4 +";
        int result = calculator.evaluate(expression);
        assertEquals(7, result);
    }

    @Test
    void testEvaluateComplexExpression() {
        PostfixCalculator calculator = new PostfixCalculator();
        String expression = "5 1 2 + 4 * + 3 -";
        int result = calculator.evaluate(expression);
        assertEquals(14, result);
    }

    @Test
    void testEvaluateDivision() {
        PostfixCalculator calculator = new PostfixCalculator();
        String expression = "6 2 /";
        int result = calculator.evaluate(expression);
        assertEquals(3, result);
    }

    @Test
    void testEvaluateWithNegativeNumbers() {
        PostfixCalculator calculator = new PostfixCalculator();
        String expression = "-2 3 +";
        int result = calculator.evaluate(expression);
        assertEquals(1, result);
    }

    @Test
    void testEvaluateWithInvalidExpression() {
        PostfixCalculator calculator = new PostfixCalculator();
        String expression = "1 2 + +";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.evaluate(expression);
        });
        assertTrue(exception.getMessage().contains("Expresión Postfix mal formada."));
    }
}

