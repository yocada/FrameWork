package estructuras;

/**
 * Representa un montículo
 * @author David
 *
 * @param <T> tipo de datos que almacena el montículo
 */
public interface IMonticulo<T extends Comparable<T>> {
	
	/**
	 * Tipos de montículo
	 * @author David
	 *
	 */
	enum Tipo{
		Maximos,
		Minimos
	}

	/**
	 * Comprueba si un montículo está vacío
	 * @return TRUE si el montículo está vacío o FALSE en caso contrario
	 */
	boolean monticuloVacio();
	
	/**
	 * Inserta un nuevo elemento en el montículo y lo flota hasta restaurar la propiedad de montículo
	 * @param elemento nuevo elemento a insertar
	 * @return montículo tras haber insertado el nuevo elemento
	 */
	IMonticulo<T> insertar(T elemento);
	
	/**
	 * Devuelve la cima del montículo sin modificarlo
	 * @return cima del montículo
	 */
	T primero();
	
	/**
	 * Devuelve la cima del montículo, la elimina del mismo y recompone la propiedad del montículo
	 * @return cima del montículo
	 */
	T obtenerCima();
	
}
