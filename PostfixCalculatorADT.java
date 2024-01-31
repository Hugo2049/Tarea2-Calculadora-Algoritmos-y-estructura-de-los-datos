/**
 * Interfaz que define el contrato para la evaluación de expresiones en notación postfix.
 */
public interface PostfixCalculatorADT {
    /**
     * Evalúa una expresión en notación postfix y devuelve el resultado.
     */
    int evaluate(String expression);
}