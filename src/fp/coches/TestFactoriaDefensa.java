package fp.coches;

import java.util.List;

public class TestFactoriaDefensa {
	public static void main(String[] args) {
		List<String> listAttrs = FactoriaCoches.leeAtributos("./data/Coches.csv");
		for(int i = 0; i<listAttrs.size(); i++) {
			System.out.println("Atributo "+i+": "+listAttrs.get(i)+"\n");
		}
	}
}
