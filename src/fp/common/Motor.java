package fp.common;

import java.util.Objects;

public class Motor implements Comparable<Motor> {
	private Double tamaño;
	private Integer potencia;
	private Double capacidad;
	private Integer eficiencia;
	
	public Motor(double tamaño, int potencia, double capacidad, int eficiencia) {
		/* Constructor que recibe todas las propiedades */
		this.tamaño = tamaño;
		this.potencia = potencia;
		this.capacidad = capacidad;
		this.eficiencia = eficiencia;
	}
	
	public Motor(String s) {
		/* Constructor a partir de String */
		String[] partes = s.split(";");
		this.tamaño = Double.valueOf(partes[0].trim());
		this.potencia = Integer.decode(partes[1].trim());
		this.capacidad = Double.valueOf(partes[2].trim());
		this.eficiencia = Integer.decode(partes[3].trim());
		this.eficiencia = Integer.decode(partes[3].trim());
	}
	
	public Double getTamaño() {
		return tamaño;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public Double getCapacidad() {
		return capacidad;
	}

	public Integer getEficiencia() {
		return eficiencia;
	}

	@Override
	public String toString() {
		return "Motor [tamaño=" + tamaño + ", potencia=" + potencia + ", capacidad=" + capacidad + ", eficiencia="
				+ eficiencia + "]";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(capacidad, eficiencia, potencia, tamaño);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motor other = (Motor) obj;
		return Objects.equals(capacidad, other.capacidad) && Objects.equals(eficiencia, other.eficiencia)
				&& Objects.equals(potencia, other.potencia) && Objects.equals(tamaño, other.tamaño);
	}

	@Override
	public int compareTo(Motor o) {
		// Compara todas las propiedades
		this.getTamaño().compareTo(o.getTamaño());
		this.getPotencia().compareTo(o.getPotencia());
		this.getCapacidad().compareTo(o.getCapacidad());
		this.getEficiencia().compareTo(o.getEficiencia());
		return 0;
	}
}
