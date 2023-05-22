package fp.coches.test;

import fp.coches.Concesionario;
import fp.coches.FactoriaCoches;

public class TestConcesionarioDefensa {
	private static Concesionario setCo = FactoriaCoches.leerCoches("./data/coches.csv");
	
	public static void print(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		print("Media de precios de Audi: "+setCo.getMediaPreciosDelFabricante("Audi"));
		print("Media de precios de Audi (Bucle): "+setCo.getMediaPreciosDelFabricanteBucle("Audi"));
		print("Mediana de precios de Acura: "+setCo.getMedianaPreciosDelFabricante("Audi"));
		print("Porcentaje de coches con precio mayor a 15000: "+setCo.getPorcentajeCochesConPrecioMayorA(15000.0));
	}
	
}