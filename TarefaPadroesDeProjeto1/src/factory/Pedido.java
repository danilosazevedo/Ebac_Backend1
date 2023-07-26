package factory;

public class Pedido {
	
	
	private String tipoCarro;

	public Pedido(String tipoCarro) {
		super();
		this.tipoCarro = tipoCarro;
	}
	
	public String getTipoCarro() {
		return tipoCarro;
	}
}
