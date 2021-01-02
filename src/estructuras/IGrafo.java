package estructuras;

import java.util.List;

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
	
	/**
	 * A�ade un v�rtice al grafo
	 * @param v v�rtice
	 */
	void addVertice(T v);
	
	/**
	 * Elimina la arista que une los v�rtices u y v
	 * @param u v�rtice
	 * @param v v�rtice
	 */
	void borrarArista(T u, T v);
	
	/**
	 * Elimina un v�rtice del grafo
	 * @param v v�rtice
	 */
	void borrarVertice(T v);
	
	/**
	 * Comprueba si dos v�rtices son adyacentes
	 * @param u v�rtice
	 * @param v v�rtice
	 * @return TRUE si los v�rtices son adyacentes y FALSE en caso contrario
	 */
	boolean adyacentes(T u, T v);
	
	/**
	 * Obtiene una lista de v�rtices adyacentes a otro
	 * @param v v�rtice
	 * @return lista de v�rtices
	 */
	List<T> getAdyacentes(T v);
	
	/**
	 * Obtiene el peso asociado a una arista que une dos v�rtices
	 * @param u v�rtice
	 * @param v v�rtice
	 * @return peso de la arista
	 */
	int etiqueta(T u, T v);
	
}
