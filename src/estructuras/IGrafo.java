package estructuras;

/**
 * Representa el TAD Grafo
 * @author David
 *
 */
public interface IGrafo<T> {

	/**
	 * A�ade una arista al grafo, que une los v�rtices u y v
	 * @param u v�rtice
	 * @param v v�rtice
	 * @param peso peso de la arista
	 */
	void addArista(T u, T v, int peso);
	
}
