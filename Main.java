import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        PostfixCalculatorADT calculator = new PostfixCalculator();
        String filePath = "datos.txt"; // Asegúrate de que la ruta del archivo sea correcta

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int result = calculator.evaluate(line);
                System.out.println("Expresión: " + line + " = " + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

