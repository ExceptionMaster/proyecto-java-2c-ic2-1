package fp.coches;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Concesionario {
	private Set<Coche> coches;
	
	public Concesionario() {
		/* Constructor vacío */
		super();
		this.coches = new HashSet<Coche>();
	}
	
	public Concesionario(Set<Coche> c) {
		/* Constructor que recibe un Set de tipos Coche
		 * y lo asigna a la propiedad this.coches */
		super();
		this.coches = c;
	}

	@Override
	public int hashCode() {
		return Objects.hash(coches);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Concesionario other = (Concesionario) obj;
		return Objects.equals(coches, other.coches);
	}
	
	public Set<Coche> getCoches() {
		return coches;
	}
	
	public Integer getNumeroCoches() {
		return coches.size();
	}
	
	public void añadirCoche(Coche c) {
		coches.add(c);
	}
	
	public void eliminarCoche(Coche c) {
		coches.remove(c);
	}
	
	public void añadirColCoches(Collection<Coche> cc) {
		coches.addAll(cc);
	}
	
	public Boolean existeCochePrecioMenor(Integer p) {
		/* Métoto para saber si existe un coche con precio menor
		 * a uno dado */
		Boolean res = false;
		for(Coche c:coches) {
			if(c.getPrecio()<p) {
				res = true;
			}
		}
		return res;
	}
	
	public Double getMediaLitros() {
		/* Método para obtener la media de capacidad del motor en 
		 * Litros de todos los coches */
		Double aux = 0.0;
		for(Coche c:coches) {
			aux+=c.getMotor().getTamaño();
		}
		return aux/coches.size();
	}
	
	public List<Coche> getCochesPorMarca(String marca){
		/* Método para obtener los coches filtrando por marca */
		List<Coche> aux = new ArrayList<Coche>();
		for(Coche c:coches) {
			if(c.getFabricante().equals(marca)) {
				aux.add(c);
			}
		}
		return aux;
	}
	
	public Map<LocalDate,Set<Coche>> getCochesPorFecha(){
		/* Método para obtener en un map los Coches agrupados por fecha */
		Map<LocalDate,Set<Coche>> res = new HashMap<LocalDate,Set<Coche>>();
		for(Coche c: coches) {
			LocalDate key = c.getSalidaMercado();
			if(res.containsKey(key)) {
				res.get(key).add(c);
			} else {
				Set<Coche> aux = new HashSet<Coche>();
				aux.add(c);
				res.put(key, aux);
			}
		}
		return res;
	}
	
	public Map<Integer, Long> getNumeroCochesPorAnyo(){
		/* Método para obtener en un map el número de coches agrupados por año */
		Map<Integer, Long> res = new HashMap<Integer, Long>();
		for(Coche c: coches) {
			Integer key = c.getSalidaMercado().getYear();
			if(res.containsKey(key)) {
				Long aux = res.get(key);
				aux++;
				res.put(key, aux);
			} else {
				res.put(key, 1l);
			}
		}
		return res;
	}
}
