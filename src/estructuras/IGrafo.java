package estructuras;

/**
 * Representa el TAD Grafo
 * @author David
 *
 */
public interface IGrafo<T> {

	/**
	 * Añade una arista al grafo, que une los vértices u y v
	 * @param u vértice
	 * @param v vértice
	 * @param peso peso de la arista
	 */
	void addArista(T u, T v, int peso);
	
}
