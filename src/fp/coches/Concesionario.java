package fp.coches;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concesionario {
	private Set<Coche> coches;
	
	public Concesionario() {
		/* Constructor vacío */
		super();
		this.coches = new HashSet<Coche>();
	}
	
	public Concesionario(Set<Coche> c) {
		/* Constructor que recibe un Set<Coche> para generar
		 * un tipo contenedor
		 */
		super();
		this.coches = c;
	}
	
	public Concesionario(Stream<Coche> streamCoche) {
		/* Constructor que recibe las propiedades básicas y un stream
		 * del tipo base para generar un tipo contenedor a través del
		 * stream */
		super();
		this.coches = streamCoche.collect(Collectors.toCollection(() -> new HashSet<Coche>()));
	}
	
	//HASHCODE
	@Override
	public int hashCode() {
		return Objects.hash(coches);
	}

	//EQUALS
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
	
	//GETTERS
	public Set<Coche> getCoches() {
		return new HashSet<Coche>(coches);
	}
		
	public Integer getNumeroCoches() {
		/* Método que no recibe parámetros y devuelve
		 * el número de tipos base en el tipo contenedor */
		return coches.size();
	}
	
	public void añadirCoche(Coche c) {
		/* Método que añade un tipo base al
		 * tipo contenedor */
		coches.add(c);
	}
	
	public void eliminarCoche(Coche c) {
		/* Método que elimina un tipo base del
		 * tipo contenedor */
		coches.remove(c);
	}
	
	public void añadirColCoches(Collection<Coche> cc) {
		/* Método que recibe como parámetro una colección
		 * de tipos base y la añade al tipo contenedor */
		coches.addAll(cc);
	}
	
	public Boolean existeCochePrecioMenor(Integer p) {
		/* Métoto que recibe como parámetro un entero p
		 * y devuelve true si existe un coche con precio
		 * menor a p */
		Boolean res = false;
		for(Coche c:coches) {
			if(c.getPrecio()<p) {
				res = true;
				break;
			}
		}
		return res;
	}
	
	public Double getMediaLitros() {
		/* Método que no recibe parámetros y devuelve 
		 * la media de litros de todos los tipos Motor
		 * de los tipos base en el tipo contenedor */
		Double aux = 0.0;
		for(Coche c:coches) {
			aux+=c.getMotor().getTamaño();
		}
		return aux/coches.size();
	}
	
	public List<Coche> getCochesPorMarca(String marca){
		/* Método que recibe un String que es la marca
		 * para luego devolver una lista de tipos base
		 * filtrando por la marca dada */
		List<Coche> aux = new ArrayList<Coche>();
		for(Coche c:coches) {
			if(c.getFabricante().equals(marca)) {
				aux.add(c);
			}
		}
		return aux;
	}
	
	public Map<LocalDate,Set<Coche>> getCochesPorFecha(){
		/* Método que no recibe parámetros y devuelve un map
		 * que tiene como clave la fecha de salida y como valor el 
		 * conjunto de tipos base que salieron en dicha fecha */
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
	
	/* MÉTODOS REHECHOS CON STREAMS PARA ENTREGA 3 */
	
	public Boolean existeCochePrecioMenorStream(Integer p) {
		/* Métoto que recibe como parámetro un entero p
		 * y devuelve true si existe un coche con precio
		 * menor a p */
		return getCoches().stream()
				.anyMatch(x -> x.getPrecio()<p);
	}
	
	public Double getMediaLitrosStream() {
		/* Método que no recibe parámetros y devuelve 
		 * la media de litros de todos los tipos Motor
		 * de los tipos base en el tipo contenedor */	
		return getCoches().stream()
				.mapToDouble(x -> x.getMotor().getTamaño())
				.average().getAsDouble();
	}
	
	public List<Coche> getCochesPorMarcaStream(String marca){
		/* Método que recibe un String que es la marca
		 * para luego devolver una lista de tipos base
		 * filtrando por la marca dada */
		return getCoches().stream()
				.filter(x -> x.getFabricante().equals(marca))
				.toList();
	}
	
	public Coche getCocheMasCaroPorMarca(String marca) {
		/* Método que recibe un String que es la marca
		 * para luego devolver un objeto del tipo base
		 * con la propiedad del precio en su valor máximo
		 * y filtrando por la marca dada */
		return getCoches().stream()
				.filter(x -> x.getFabricante().equals(marca))
				.max(Comparator.comparing(Coche::getPrecio))
				.get();
	}
	
	public List<Coche> getFiltroPrecioOrdenadoPorMarca(Integer precio) {
		/* Método que recibe un precio para primero filtrar
		 * los tipos base del contenedor por este (siendo
		 * el precio del tipo base menor o igual al dado).
		 * Luego se ordena por marca y se devuelve una lista. */
		return getCoches().stream()
				.filter(x -> x.getPrecio() <= precio)
				.sorted(Comparator.comparing(Coche::getFabricante))
				.toList();

	}
	
	
}
