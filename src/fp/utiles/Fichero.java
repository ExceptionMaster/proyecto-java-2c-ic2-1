package fp.utiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Fichero {
	public static List<String> leerFichero(String nombre) {
		List<String> res = null;
		try {
			res = Files.readAllLines(Path.of(nombre));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
}
