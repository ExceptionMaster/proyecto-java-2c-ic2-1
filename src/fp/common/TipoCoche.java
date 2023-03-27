package fp.common;

public enum TipoCoche {
	Passenger("PASSENGER"), Car("CAR");
	
	private String tipo;
	
	TipoCoche(String s){
		this.tipo = s;
	}
	
	public String getTipo() {
		return tipo;
	}
}
