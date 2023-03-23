package fp.common;

public enum ColorCoche {
	ROJO("ROJO"),NEGRO("NEGRO"),AMARILLO("AMARILLO"),AZUL("AZUL"),VERDE("VERDE"),BLANCO("BLANCO"),GRIS("GRIS");
	
	private String color;
	
	ColorCoche(String s){
		this.color = s;
	}
	
	public String getTipo() {
		return color;
	}
}
