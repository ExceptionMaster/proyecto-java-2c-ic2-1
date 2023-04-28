package fp.coches;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import fp.common.ColorCoche;
import fp.common.Motor;
import fp.common.TipoCoche;
import fp.utiles.Fichero;


public class FactoriaCoches {
	/* Lee el fichero CSV y devuelve un tipo Concesionario cuya única 
	 * propiedad es un Set de tipos Coche*/
	public static Concesionario leerCoches(String rutaFichero) {
		List<String> lista = Fichero.leerFichero(rutaFichero, true);
		Set<Coche> aux = new HashSet<Coche>();
		for(String s:lista) {
			aux.add(parseaCoches(s));
		}
		return new Concesionario(aux);
	}
	
	public static Concesionario leerCochesStream(String rutaFichero) {
		List<String> lista = Fichero.leerFichero(rutaFichero, true);
		Stream<Coche> streamCoche = lista.stream().map(FactoriaCoches::parseaCoches);
		return new Concesionario(streamCoche);
	}
	
	public static Coche parseaCoches(String cocheString) {
		/* Parsea un string tipo 
		 * "Fabricante;Modelo;Tamaño;Potencia;Capacidad;Eficiencia;Tipo;Precio;salidaMercado;listaColores" 
		 * para crear un tipo Coche*/
		String[] csa = cocheString.split(";");
		String fabricante = csa[0].trim();
		String modelo = csa[1].trim();
		Motor motor = new Motor(csa[6].trim()+";"+csa[7].trim()+";"+csa[12].trim()+";"+csa[13].trim());
		TipoCoche tipo = TipoCoche.valueOf(csa[4]);
		Integer precio = (int) (Double.parseDouble(csa[5].trim())*1000);
		LocalDate salidaMercado = LocalDate.parse(csa[14].trim(),
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String colores = null;
		if(Arrays.asList(csa).size()==20) {
			colores = csa[15]+","+csa[16]+","+csa[17]+","+csa[18]+","+csa[19];
		} else if(Arrays.asList(csa).size()==19) {
			colores = csa[15]+","+csa[16]+","+csa[17]+","+csa[18];
		}
		List<String> listaColoresString = Arrays.asList(colores.split(","));
		List<ColorCoche> listaColores = new ArrayList<ColorCoche>();
		for(String s:listaColoresString) {
			listaColores.add(ColorCoche.valueOf(s));
		}
		return new Coche(fabricante,modelo,motor,tipo,precio,salidaMercado,listaColores);
	}
	
	
}
