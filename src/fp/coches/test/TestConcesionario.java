package fp.coches.test;

import java.util.List;
import java.util.Scanner;

import fp.coches.Coche;
import fp.coches.Concesionario;
import fp.coches.FactoriaCoches;
import fp.utiles.Mostrar;

public class TestConcesionario {
	private static Concesionario setCo = FactoriaCoches.leerCoches("./data/coches.csv");
	
	public static void print(Object o) {
		System.out.println(o);
	}
	
	public static void initOptions() {
		print("Elige una opción: ");
		print("1. Métodos normales");
		print("2. Métodos con Stream");
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
		Mostrar.mostrar(listaFiltradaCoches, listaFiltradaCoches.size());
		print("-----------------------------------------------------------");
		
		print("\n-------------- PRUEBA DE getCochesPorFecha --------------");
		print("Coches por fecha: \n" + setCo.getCochesPorFecha());
		print("-----------------------------------------------------------");
		
		print("\n-------------- PRUEBA DE getNumeroCochesPorAnyo --------------");
		print("Número de coches por año: \n" + setCo.getNumeroCochesPorAnyo());
		print("----------------------------------------------------------------");
	}
	
	public static void TesteoConcesionarioStream() {
		print("\n-------------- PRUEBA DE existeCochePrecioMenorStream --------------");
		print("Existe coche con precio < 15000: \n" + setCo.existeCochePrecioMenorStream(15000));
		print("----------------------------------------------------------------");
		
		print("\n-------------- PRUEBA DE getMediaLitrosStream --------------");
		print("Media del tamaño del motor: \n" + setCo.getMediaLitrosStream());
		print("--------------------------------------------------------");
		
		print("\n-------------- PRUEBA DE getCochesPorMarcaStream --------------");
		print("Coches de la marca Chevrolet:");
		List<Coche> listaFiltradaCoches = setCo.getCochesPorMarcaStream("Chevrolet");
		Mostrar.mostrar(listaFiltradaCoches, listaFiltradaCoches.size());
		print("-----------------------------------------------------------");
		
		print("\n-------------- PRUEBA DE getCocheMasCaroPorMarca --------------");
		print("Coche de la marca Audi más caro: \n" + setCo.getCocheMasCaroPorMarca("Audi"));
		print("----------------------------------------------------------------");
		
		print("\n-------------- PRUEBA DE getFiltroPrecioOrdenadoPorMarca --------------");
		print("Coches con precio <= 35000€ ordenados por marca:");
		List<Coche> aux = setCo.getFiltroPrecioOrdenadoPorMarca(35000);
		Mostrar.mostrar(aux, aux.size());
		print("----------------------------------------------------------------");
		
		print("\n-------------- PRUEBA DE getCochesPorFechaStream --------------");
		print("Coches por fecha: \n" + setCo.getCochesPorFechaStream());
		print("-----------------------------------------------------------");
		
		print("\n-------------- PRUEBA DE getFabricantesDistintos --------------");
		print("Fabricantes distintos: \n" + setCo.getFabricantesDistintos());
		print("-----------------------------------------------------------");
		
		print("\n-------------- PRUEBA DE getCochesMasCarosPorFecha --------------");
		print("Coches más caros por fecha: \n" + setCo.getCochesMasCarosPorFecha());
		print("-----------------------------------------------------------");
		
		print("\n-------------- PRUEBA DE getCochesConMejorMotorPorFabricante --------------");
		print("Coches con mejor motor por Fabricante: \n" + setCo.getCochesConMejorMotorPorFabricante());
		print("-----------------------------------------------------------");		
	}
	
	public static void main(String[] args) {
		/* Se puede elegir ver los métodos normales
		 * o implementados con Stream para no tener que
		 * hacer scroll todo el rato para verlos. */
		initOptions();
		Scanner input = new Scanner(System.in);
		int opcion = input.nextInt();
		input.close();
		while(true) {
			if(opcion == 1) {
				TesteoConcesionario();
				break;
			} else if(opcion == 2) {
				TesteoConcesionarioStream();
				break;
			} else {
				print("Error");
				break;
			}
		}
		
	}
}
