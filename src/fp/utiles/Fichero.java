package fp.utiles;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Fichero {
	public static List<String> leerFichero(String nomfich){
		/* Método que recibe un String que es la ruta del fichero a leer
		 * para luego intentar leer el fichero por línea y asignarlo en l.
		 * Lanza una IOException si hay algún error al leer el fichero. 
		 * Devuelve la lista de Strings de haber leído el fichero. */
		List<String> l=null;
		try {
			l = Files.lines(Paths.get(nomfich),StandardCharsets.UTF_8).toList();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		l.remove((int) 0);
		return l;
	}
	public static List<String> leerFichero(String nomfich, Boolean quitarCabecera){
		/* Método exactamente igual que el anterior pero que recibe un booleano
		 * como parámetro para elegir quitar la cabecera del CSV en caso de que
		 * tenga */
		List<String> l=null;
			try {
				l = Files.readAllLines(Paths.get(nomfich),StandardCharsets.UTF_8);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		if(quitarCabecera) {
			l.remove((int) 0);
		}
		return l;
	}
	public static void escribeFichero(List<String> cadenas, String nombreFichero) {
		/* Método que recibe como parámetro una lista de strings y una string que 
		 * es la ruta del fichero donde se va a escribir dicha lista de strings
		 * línea por línea. Lanza una IOException si hay algún error al escribir
		 * en el fichero.  */
		try {
			Files.write(Paths.get(nombreFichero), cadenas, StandardCharsets.UTF_8);
		} catch(IOException e) {
			System.out.println("Error en la escritura del fichero");
		}
	}
}
