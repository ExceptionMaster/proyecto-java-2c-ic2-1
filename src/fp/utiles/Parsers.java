package fp.utiles;

import java.time.LocalDate;

import fp.common.TipoCoche;

public class Parsers {
	public static String tipoCocheParser(TipoCoche tipo) {
		String res = null;
		if(tipo==TipoCoche.PASSENGER) {
			res = "Passenger";
		} else if(tipo==TipoCoche.CAR) {
			res = "Car";
		}
		return res;
	}
	
	public static String salidaMercadoParser(LocalDate fecha) {
		return fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear();
	}
}
