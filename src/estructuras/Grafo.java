package estructuras;

import java.util.List;

/**
 * Implementación de un grafo con matriz de adyacencia
 * @author David
 *
 */
public class Grafo<T> implements IGrafo<T> {

	private int matriz[][];
	private int size;
	private T[] vertices;
	
	@SuppressWarnings("unchecked")
	public Grafo() {
		matriz = new int[1][1];
		vertices = (T[]) new Object[1];
		size = 0;
	}
	
	@Override
	public void addArista(T u, T v, int peso) {
		int[] indices = getIndices(u, v);
		matriz[indices[0]][indices[1]] = peso;
		matriz[indices[1]][indices[0]] = peso;
	}

	@Override
	public void addVertice(T v) {
		if (matriz[0].length == size) ampliarMatriz();
		if (vertices.length == size) ampliarVector();
		vertices[size] = v;
		size++;
	}

	@Override
	public void borrarArista(T u, T v) {
		int[] indices = getIndices(u, v);
		matriz[indices[0]][indices[1]] = 0;
		matriz[indices[1]][indices[0]] = 0;
	}

	@Override
	public void borrarVertice(T v) {
		int[] indices = getIndices(v, v);
		eliminarVertice(indices[0]);
		size--;
	}

	@Override
	public boolean adyacentes(T u, T v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<T> getAdyacentes(T v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int etiqueta(T u, T v) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private int[] getIndices(T u, T v) {
		int[] res = new int[2];
		if (u.getClass().getSimpleName().equals("int")) {
			res[0] = (int)u;
			res[1] = (int)v;
			return res;
		}else {
			for(int i=0; i < size; i++) {
				if (u.equals(vertices[i])) res[0] = i;
				if (v.equals(vertices[i])) res[1] = i;
			}
			return res;
		}
	}
	
	private void ampliarMatriz() {
		int[][] nuevaMatriz = new int[size*2][size*2];
		for(int i=0; i < size; i++) {
			for(int j=0; j < size; j++) {
				nuevaMatriz[i][j] = matriz[i][j];
			}
		}
		matriz = nuevaMatriz;
	}
	
	private void ampliarVector() {
		T[] nuevoVector = (T[])new Object[size*2];
		for(int i=0; i < size; i++) {
			nuevoVector[i] = vertices[i];
		}
		vertices = nuevoVector;
	}
	
	private void eliminarVertice(int v) {
		int[][] nuevaMatriz = new int[matriz.length - 1][matriz.length - 1];
		int ajuste = 0;
		for(int i=0; i < size; i++) {
			if (i != v) {
				for(int j=0; j < size; j++) {
					if (j != v) {
						int indiceJ = j-ajuste < 0 ? 0 : j-ajuste;
						nuevaMatriz[i-ajuste][indiceJ] = matriz[i][j];
					}
				}
			}else {
				ajuste++;
			}
		}
		matriz = nuevaMatriz;
		
		T[] nuevoVector = (T[])new Object[size-1];
		ajuste = 0;
		for(int i=0; i < size; i++) {
			if (i != v) {
				nuevoVector[i-ajuste] = vertices[i];
			}
		}
		vertices = nuevoVector;
	}

}
