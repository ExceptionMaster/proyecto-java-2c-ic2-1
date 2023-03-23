package fp.coches.test;

import fp.coches.FactoriaCoches;
import fp.utiles.Mostrar;

public class TestFactoriaCoches {
	
	public static void TestFactoria() {
		System.out.println();
		System.out.println("-------------- PRUEBA DEL OBJETO FactoriaCoches -----------");
		Mostrar.mostrar(FactoriaCoches.leeCoches("./data/Coches.csv"), FactoriaCoches.leeCoches("./data/Coches.csv").size());
		System.out.println("-----------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		TestFactoria();
	}

}
