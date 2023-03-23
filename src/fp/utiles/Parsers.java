package fp.utiles;

import java.time.LocalDate;

import fp.common.TipoCoche;

public class Parsers {
	/* Parsea PASSENGER y CAR del enumerado TipoCoche a los strings "Passenger" y "Car" */
	public static String tipoCocheParser(TipoCoche tipo) {
		String res = null;
		if(tipo==TipoCoche.Passenger) {
			res = "Passenger";
		} else if(tipo==TipoCoche.Car) {
			res = "Car";
		}
		return res;
	}
	
	public static String salidaMercadoParser(LocalDate fecha) {
		/* Parsea la fecha a formato dd/MM/YYYY */
		return fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear();
	}
}
