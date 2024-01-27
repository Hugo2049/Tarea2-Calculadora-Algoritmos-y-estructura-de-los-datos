public class PostfixCalculator implements PostfixCalculatorADT {
    @Override
    public int evaluate(String expression) {
        Stack<Integer> stack = new VectorStack<>();

        for (String token : expression.split("\\s")) {
            if (token.matches("-?\\d+")) { // Es un número
                stack.push(Integer.parseInt(token));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return stack.pop();
    }
}
