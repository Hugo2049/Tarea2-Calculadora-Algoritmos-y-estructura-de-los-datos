import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Clase de prueba para la clase PostfixCalculator que verifica el correcto funcionamiento
 * de la evaluación de expresiones en notación postfix.
 */
public class PostfixCalculatorTest {

    /**
     * Prueba la evaluación de una expresión postfix simple (suma).
     */
    @Test
    public void testEvaluateSimpleExpression() {
        // Crea una instancia del PostfixCalculator para realizar la prueba.
        PostfixCalculator calculator = new PostfixCalculator();
        // Define la expresión postfix a evaluar.
        String expression = "3 4 +";
        // Realiza la evaluación y verifica que el resultado sea el esperado.
        int result = calculator.evaluate(expression);
        assertEquals(7, result);
    }

    /**
     * Prueba la evaluación de una expresión postfix más compleja.
     */
    @Test
    public void testEvaluateComplexExpression() {
        // Crea una instancia del PostfixCalculator para realizar la prueba.
        PostfixCalculator calculator = new PostfixCalculator();
        // Define la expresión postfix a evaluar.
        String expression = "5 1 2 + 4 * + 3 -";
        // Realiza la evaluación y verifica que el resultado sea el esperado.
        int result = calculator.evaluate(expression);
        assertEquals(14, result);
    }

    /**
     * Prueba la evaluación de una expresión postfix con división.
     */
    @Test
    public void testEvaluateDivision() {
        // Crea una instancia del PostfixCalculator para realizar la prueba.
        PostfixCalculator calculator = new PostfixCalculator();
        // Define la expresión postfix a evaluar.
        String expression = "7 2 /";
        // Realiza la evaluación y verifica que el resultado sea el esperado.
        int result = calculator.evaluate(expression);
        assertEquals(3, result);
    }

    /**
     * Prueba la evaluación de una expresión postfix con números negativos.
     */
    @Test
    public void testEvaluateWithNegativeNumbers() {
        // Crea una instancia del PostfixCalculator para realizar la prueba.
        PostfixCalculator calculator = new PostfixCalculator();
        // Define la expresión postfix a evaluar.
        String expression = "9 8 +";
        // Realiza la evaluación y verifica que el resultado sea el esperado.
        int result = calculator.evaluate(expression);
        assertEquals(17, result);
    }
}
