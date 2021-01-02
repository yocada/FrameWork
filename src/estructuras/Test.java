package estructuras;

public class Test {
	
	public static void main(String[] args) {
		//IMonticulo
//		IMonticulo<Integer> monticulo = new Monticulo<Integer>(10);
//		System.out.println(monticulo.monticuloVacio());
//		monticulo.insertar(5);
//		System.out.println(monticulo.monticuloVacio());
//		monticulo.insertar(1);
//		monticulo.insertar(9);
//		monticulo.insertar(3);
//		monticulo.insertar(5);
//		while (!monticulo.monticuloVacio()) {
//			System.out.println(monticulo.obtenerCima());
//		}
//		System.out.print("Fin");
		//IGrafo
		IGrafo<String> grafo = new Grafo<String>();
		grafo.addVertice("a");
		grafo.addVertice("b");
		grafo.addVertice("c");
		grafo.addArista("b", "c", 5);
	}

}
