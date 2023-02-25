package fp.coches;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fp.common.ColorCoche;
import fp.common.TipoCoche;

public class Coches {
	private String fabricante;
	private String modelo;
	private Integer ventas;
	private Integer precio;
	private Float capacidad_combustible;
	private Float tamaño_motor;
	private LocalDate salida_mercado;
	private TipoCoche tipoCoche;
	private List<ColorCoche> listaColores = new ArrayList<ColorCoche>();
	
	public Coches(
			String f,
			String m,
			Integer v,
			Integer p,
			Float cap_com,
			Float tam_mot,
			LocalDate sal_mer,
			TipoCoche tC) {
		
	}
}
