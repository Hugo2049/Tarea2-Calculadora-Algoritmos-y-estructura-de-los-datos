/**
 * Interfaz que define las operaciones básicas de una pila (stack) genérica.
 *
 * @param <T> El tipo de elementos que la pila contendrá.
 */
public interface Stack<T> {
    /**
     * Agrega un elemento a la parte superior de la pila.
     *
     */
    void push(T item);

    /**
     * Elimina y devuelve el elemento en la parte superior de la pila.
     *
     * @return El elemento en la parte superior de la pila.
     * @throws java.util.EmptyStackException Si la pila está vacía.
     */
    T pop();

    /**
     * Devuelve el elemento en la parte superior de la pila sin eliminarlo.
     *
     * @return El elemento en la parte superior de la pila.
     * @throws java.util.EmptyStackException Si la pila está vacía.
     */
    T peek();

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false en caso contrario.
     */
    boolean isEmpty();

    /**
     * Devuelve el número de elementos en la pila.
     *
     * @return El tamaño de la pila.
     */
    int size();
}