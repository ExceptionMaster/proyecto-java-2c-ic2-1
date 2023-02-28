package fp.coches.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fp.coches.Coche;
import fp.common.ColorCoche;
import fp.common.TipoCoche;

public class TestCoches {
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		List<ColorCoche> listaColores1 = new ArrayList<ColorCoche>();
		listaColores1.add(ColorCoche.NEGRO);
		listaColores1.add(ColorCoche.ROJO);
		listaColores1.add(ColorCoche.BLANCO);
		listaColores1.add(ColorCoche.AZUL);
		Coche c1 = new Coche("Audi","A4",150,(float) 1.8,TipoCoche.PASSENGER,23990,LocalDate.of(2015, 8, 15),listaColores1);
		System.out.println("Formato completo");
		System.out.println(c1);
		System.out.println("Formato corto");
		System.out.println(c1.getFormatoCorto());
	}
}