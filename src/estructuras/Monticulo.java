package estructuras;

public class Monticulo<T extends Comparable<T>> implements IMonticulo<T> {
	
	private T[] vector;
	private int contador;
	private int max;
	private Tipo tipoMonticulo;

	/**
	 * Obtiene un nuevo montículo
	 * @param pMax tamaño máximo del montículo
	 * @param pTipoMonticulo tipo de montículo
	 */
	@SuppressWarnings("unchecked")
	public Monticulo(int pMax, Tipo pTipoMonticulo) {
		vector = (T[]) new Comparable[pMax];
		contador = 0;
		max = pMax;
		tipoMonticulo = pTipoMonticulo;
	}
	
	/**
	 * Obtiene un nuevo montículo de máximos
	 * @param pMax tamaño máximo del montículo
	 */
	public Monticulo(int pMax) {
		this(pMax,Tipo.Maximos);
	}

	@Override
	public boolean monticuloVacio() {
		return contador == 0;
	}

	@Override
	public IMonticulo<T> insertar(T elemento) {
		if (contador == max) throw new IllegalStateException("El montículo está lleno");
		vector[contador] = elemento;
		flotar(contador);
		contador++;
		return this;
	}

	@Override
	public T primero() {
		if (contador == 0) throw new IllegalStateException("El montículo está vacío");
		return vector[0];
	}

	@Override
	public T obtenerCima() {
		T res = primero();
		vector[0] = vector[contador - 1];
		contador--;
		hundir(0);
		return res;
	}
	
	private void flotar(int pPosicion) {
		if (tipoMonticulo == Tipo.Maximos) {
			while (pPosicion > 0 && vector[((pPosicion+1) / 2)-1].compareTo(vector[pPosicion]) < 0) {
				intercambiar(pPosicion,((pPosicion+1) / 2)-1);
			}
		}else {
			while (pPosicion > 0 && vector[((pPosicion+1) / 2)-1].compareTo(vector[pPosicion]) > 0) {
				intercambiar(pPosicion,((pPosicion+1) / 2)-1);
			}
		}
	}
	
	private void hundir(int pPosicion) {
		int hi,hd,p;
		do {
			hi = ((pPosicion + 1) * 2) - 1;
			hd = (pPosicion + 1) * 2;
			p = pPosicion;
			if (tipoMonticulo == Tipo.Maximos) {
				if (hd <= contador && vector[hd].compareTo(vector[pPosicion]) > 0) {
					pPosicion = hd;
				}
				if (hi <= contador && vector[hi].compareTo(vector[pPosicion]) > 0) {
					pPosicion = hi;
				}
			}else {
				if (hd <= contador && vector[hd].compareTo(vector[pPosicion]) < 0) {
					pPosicion = hd;
				}
				if (hi <= contador && vector[hi].compareTo(vector[pPosicion]) < 0) {
					pPosicion = hi;
				}
			}
			intercambiar(p, pPosicion);
		}while(p != pPosicion);
	}
	
	private void intercambiar(int destino, int origen) {
		T tmp = vector[destino];
		vector[destino] = vector[origen];
		vector[origen] = tmp;
	}

}
