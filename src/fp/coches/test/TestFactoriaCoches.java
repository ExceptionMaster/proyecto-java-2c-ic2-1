package fp.coches.test;

import fp.coches.FactoriaCoches;
import fp.utiles.Mostrar;

public class TestFactoriaCoches {
	public static void print(Object o) {
		System.out.println(o);
	}
	
	public static void TestFactoria() {
		print("-------------- PRUEBA DE FactoriaCoches -----------");
		print("[leerCoches]");
		Mostrar.mostrar(FactoriaCoches.leerCoches("./data/Coches.csv").getCoches(), 10);
		print(".\n.\n.");
		print("[leerCochesStream]");
		Mostrar.mostrar(FactoriaCoches.leerCochesStream("./data/Coches.csv").getCoches(), 10);
		print(".\n.\n.");
		print("---------------------------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		TestFactoria();
	}

}
