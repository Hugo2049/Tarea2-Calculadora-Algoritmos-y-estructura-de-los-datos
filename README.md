# Tarea2-Calculadora-Algoritmos-y-estructura-de-los-datos
Postfix Calculator
Este conjunto de códigos implementa un evaluador de expresiones en notación postfix utilizando una pila (stack) genérica. Se compone de las siguientes clases e interfaces:

PostfixCalculatorADT
Esta interfaz define el contrato para la evaluación de expresiones en notación postfix. Proporciona un único método:

java
Copy code
int evaluate(String expression);
PostfixCalculator
La clase PostfixCalculator implementa la interfaz PostfixCalculatorADT y realiza la evaluación de expresiones en notación postfix utilizando una pila.

Main
La clase Main utiliza la implementación de PostfixCalculator para leer expresiones desde un archivo de texto (datos.txt) y mostrar los resultados de la evaluación.

Stack<T>
La interfaz genérica Stack<T> define las operaciones básicas de una pila. Proporciona métodos para agregar, eliminar, y consultar elementos en la pila.

VectorStack<T>
La clase VectorStack<T> implementa la interfaz Stack<T> utilizando la clase Vector de Java. Proporciona una implementación de pila basada en un vector dinámico.

PostfixCalculatorTest
La clase de prueba PostfixCalculatorTest utiliza JUnit para verificar el correcto funcionamiento de la clase PostfixCalculator. Incluye pruebas para expresiones simples y complejas, así como para casos que involucran números negativos y operaciones de división.

Instrucciones de Uso
Agregar las expresiones en notación postfix al archivo datos.txt.
Ejecutar la clase Main para leer y evaluar las expresiones desde el archivo.
Observar los resultados de la evaluación en la consola.
