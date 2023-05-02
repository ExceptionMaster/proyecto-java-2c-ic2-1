package fp.utiles;

import java.util.HashMap;
import java.util.Map;

public class Utiles extends HashMap<Object, Object>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getKey(Object value) {
		return this
	      .entrySet()
	      .stream()
	      .filter(entry -> value.equals(entry.getValue()))
	      .map(Map.Entry::getKey).toString();
		
	}
}
