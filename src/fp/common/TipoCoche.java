package fp.common;

public enum TipoCoche {
	Passenger("Passenger"), Car("Car");
	
	private String tipo;
	
	TipoCoche(String s){
		this.tipo = s;
	}
	
	public String getTipo() {
		return tipo;
	}
}
