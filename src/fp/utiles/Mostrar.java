package fp.utiles;

import java.util.Collection;

public class Mostrar {
	/* Bucle para imprimir una cantidad n de objetos de una colección*/
	public static <T> void mostrar(Collection<T> coleccion, Integer n) {
		if (n> coleccion.size()) {
			n= coleccion.size();
		}
		int i = 0;
		for (T e : coleccion) {
			if (i< n) {
			System.out.println(e);
			}else {
				break;
			}
			i++;
			
		}
	}
}
