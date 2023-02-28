package fp.coches;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import fp.common.ColorCoche;
import fp.common.TipoCoche;

public class Coche {
	private String fabricante;
	private String modelo;
	private Integer potencia;
	private Float tamañoMotor;
	private TipoCoche tipo;
	private Integer precio;
	private LocalDate salidaMercado;
	private List<ColorCoche> listaColores = new ArrayList<ColorCoche>();
	
	public Coche(String fab,String mod,Integer pot,Float tamMot,TipoCoche tipo,Integer prec,LocalDate salMerc,List<ColorCoche> cols) {
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
	
	public String tipoCocheParser(TipoCoche tipo) {
		String res = null;
		if(tipo==TipoCoche.PASSENGER) {
			res = "Passenger";
		} else if(tipo==TipoCoche.CAR) {
			res = "Car";
		}
		return res;
	}
	
	public String salidaMercadoParser(LocalDate fecha) {
		return fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear();
	}
	
	public String getFormatoCorto() {
		return getFabricante() + " " + 
			   getModelo() + " " + 
			   getTamañoMotor() + "L/" + 
			   getPotencia() + "cv (" + 
			   getPrecio() + "€) - " + 
			   getTipo() + " - " + 
			   salidaMercadoParser(getSalidaMercado()) + " - " + 
			   getListaColores();
	}

	@Override
	public String toString() {
		return "Coches [fabricante=" + fabricante + ", modelo=" + modelo + ", potencia=" + potencia + "cv, tamañoMotor="
				+ tamañoMotor + "L, tipo=" + tipoCocheParser(tipo) + ", precio=" + precio + "€, salidaMercado=" + salidaMercadoParser(salidaMercado)
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

}
