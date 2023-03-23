package fp.coches;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Coches {
	private Set<Coche> coches;
	
	public Coches() {
		super();
		this.coches = new HashSet<Coche>();
	}
	
	public Coches(Set<Coche> c) {
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
		Coches other = (Coches) obj;
		return Objects.equals(coches, other.coches);
	}
	
	public Integer getNumeroCoches() {
		return coches.size();
	}
	
	public void añadirCoche(Coche c) {
		coches.add(c);
	}
	
	
	
}
