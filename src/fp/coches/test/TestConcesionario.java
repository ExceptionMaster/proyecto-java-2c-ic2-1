package fp.coches.test;

import java.util.List;

import fp.coches.Coche;
import fp.coches.Concesionario;
import fp.coches.FactoriaCoches;

public class TestConcesionario {
	private static Concesionario setCo = FactoriaCoches.leerCoches("./data/coches.csv");
	
	public static void print(Object o) {
		System.out.println(o);
	}
	
	public static void TesteoConcesionario() {
		print("\n-------------- PRUEBA DE getNumeroCoches --------------");
		print("Número de coches: \n" + setCo.getNumeroCoches());
		print("---------------------------------------------------------");
		
		print("\n-------------- PRUEBA DE existeCochePrecioMenor --------------");
		print("Existe coche con precio < 15000: \n" + setCo.existeCochePrecioMenor(15000));
		print("----------------------------------------------------------------");
		
		print("\n-------------- PRUEBA DE getMediaLitros --------------");
		print("Media del tamaño del motor: \n" + setCo.getMediaLitros());
		print("--------------------------------------------------------");
		
		print("\n-------------- PRUEBA DE getCochesPorMarca --------------");
		print("Coches de la marca Chevrolet:");
		List<Coche> listaFiltradaCoches = setCo.getCochesPorMarca("Chevrolet");
		for(Coche c:listaFiltradaCoches) {
			print(c);
		}
		print("-----------------------------------------------------------");
		
		print("\n-------------- PRUEBA DE getCochesPorFecha --------------");
		print("Coches por fecha: \n" + setCo.getCochesPorFecha());
		print("-----------------------------------------------------------");
		
		print("\n-------------- PRUEBA DE getNumeroCochesPorAnyo --------------");
		print("Número de coches por año: \n" + setCo.getNumeroCochesPorAnyo());
		print("----------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		TesteoConcesionario();
	}
}
