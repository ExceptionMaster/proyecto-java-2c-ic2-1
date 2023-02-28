package fp.coches;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import fp.common.ColorCoche;
import fp.common.TipoCoche;
import fp.utiles.Checkers;
import fp.utiles.Parsers;

public class Coche implements Comparable<Coche>{
	private String fabricante;
	private String modelo;
	private Integer potencia;
	private Float tamañoMotor;
	private TipoCoche tipo;
	private Integer precio;
	private LocalDate salidaMercado;
	private List<ColorCoche> listaColores = new ArrayList<ColorCoche>();
	
	public Coche(String fab,String mod,Integer pot,Float tamMot,TipoCoche tipo,Integer prec,LocalDate salMerc,List<ColorCoche> cols) {
		Checkers.check("El fabricante no puede ser null: ", fabricante != null);
		Checkers.check("El modelo no puede ser null: ", modelo != null);
		Checkers.check("La potencia no puede ser 0 o menor: ", potencia > 0);
		Checkers.check("El tamaño del motor no puede ser 0 o menor: ", tamañoMotor > 0);
		Checkers.check("El tipo no puede ser null: ", tipo != null);
		Checkers.check("El precio no puede ser 0 o menor: ", precio > 0);
		Checkers.check("La fecha de salida no puede ser null: ", salidaMercado != null);
		Checkers.check("Los colores sólo pueden ser null a partir de Color 1: ", listaColores.get(0) != null);
		this.fabricante = fab;
		this.modelo = mod;
		this.potencia = pot;
		this.tamañoMotor = tamMot;
		this.tipo = tipo;
		this.precio = prec;
		this.salidaMercado = salMerc;
		this.listaColores = cols;
	}
	
	public Coche(String fab, String mod, List<ColorCoche> cols) {
		Checkers.check("El fabricante no puede ser null: ", fabricante != null);
		Checkers.check("El fabricante no puede ser null: ", fabricante != null);
		Checkers.check("El fabricante no puede ser null: ", fabricante != null);
		this.fabricante = fab;
		this.modelo = mod;
		this.listaColores = cols;
	}
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Float getTamañoMotor() {
		return tamañoMotor;
	}

	public void setTamañoMotor(Float tamañoMotor) {
		this.tamañoMotor = tamañoMotor;
	}
	
	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	public LocalDate getSalidaMercado() {
		return salidaMercado;
	}

	public void setSalidaMercado(LocalDate salidaMercado) {
		this.salidaMercado = salidaMercado;
	}

	public TipoCoche getTipo() {
		return tipo;
	}

	public void setTipo(TipoCoche tipo) {
		this.tipo = tipo;
	}

	public List<ColorCoche> getListaColores() {
		return listaColores;
	}

	public void setListaColores(List<ColorCoche> listaColores) {
		this.listaColores = listaColores;
	}
	

	
	public String getFormatoCorto() {
		return getFabricante() + " " + 
			   getModelo() + " " + 
			   getTamañoMotor() + "L/" + 
			   getPotencia() + "cv (" + 
			   getPrecio() + "€) - " + 
			   getTipo() + " - " + 
			   Parsers.salidaMercadoParser(getSalidaMercado()) + " - " + 
			   getListaColores();
	}

	@Override
	public String toString() {
		return "Coches [fabricante=" + fabricante + ", modelo=" + modelo + ", potencia=" + potencia + "cv, tamañoMotor="
				+ tamañoMotor + "L, tipo=" + Parsers.tipoCocheParser(tipo) + ", precio=" + precio + "€, salidaMercado=" + Parsers.salidaMercadoParser(salidaMercado)
				+ ", listaColores=" + listaColores + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(fabricante, other.fabricante) && Objects.equals(listaColores, other.listaColores)
				&& Objects.equals(modelo, other.modelo) && Objects.equals(potencia, other.potencia)
				&& Objects.equals(precio, other.precio) && Objects.equals(salidaMercado, other.salidaMercado)
				&& Objects.equals(tamañoMotor, other.tamañoMotor) && tipo == other.tipo;
	}
	
	public int compareTo(Coche c) {
	    return this.getFabricante().compareTo(c.getFabricante());
	}
}
