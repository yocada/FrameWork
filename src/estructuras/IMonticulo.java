package estructuras;

/**
 * Representa un mont�culo
 * @author David
 *
 * @param <T> tipo de datos que almacena el mont�culo
 */
public interface IMonticulo<T extends Comparable<T>> {
	
	/**
	 * Tipos de mont�culo
	 * @author David
	 *
	 */
	enum Tipo{
		Maximos,
		Minimos
	}

	/**
	 * Comprueba si un mont�culo est� vac�o
	 * @return TRUE si el mont�culo est� vac�o o FALSE en caso contrario
	 */
	boolean monticuloVacio();
	
	/**
	 * Inserta un nuevo elemento en el mont�culo y lo flota hasta restaurar la propiedad de mont�culo
	 * @param elemento nuevo elemento a insertar
	 * @return mont�culo tras haber insertado el nuevo elemento
	 */
	IMonticulo<T> insertar(T elemento);
	
	/**
	 * Devuelve la cima del mont�culo sin modificarlo
	 * @return cima del mont�culo
	 */
	T primero();
	
	/**
	 * Devuelve la cima del mont�culo, la elimina del mismo y recompone la propiedad del mont�culo
	 * @return cima del mont�culo
	 */
	T obtenerCima();
	
}
