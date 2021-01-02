package estructuras;

import java.util.List;

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
	
	/**
	 * Añade un vértice al grafo
	 * @param v vértice
	 */
	void addVertice(T v);
	
	/**
	 * Elimina la arista que une los vértices u y v
	 * @param u vértice
	 * @param v vértice
	 */
	void borrarArista(T u, T v);
	
	/**
	 * Elimina un vértice del grafo
	 * @param v vértice
	 */
	void borrarVertice(T v);
	
	/**
	 * Comprueba si dos vértices son adyacentes
	 * @param u vértice
	 * @param v vértice
	 * @return TRUE si los vértices son adyacentes y FALSE en caso contrario
	 */
	boolean adyacentes(T u, T v);
	
	/**
	 * Obtiene una lista de vértices adyacentes a otro
	 * @param v vértice
	 * @return lista de vértices
	 */
	List<T> getAdyacentes(T v);
	
	/**
	 * Obtiene el peso asociado a una arista que une dos vértices
	 * @param u vértice
	 * @param v vértice
	 * @return peso de la arista
	 */
	int etiqueta(T u, T v);
	
}
