package factory;

public class Demo {

	public static void main(String[] args) {
		Pedido pedido = new Pedido("Popular");
		Factory factory = getFactory(pedido);
		factory.create(pedido.getTipoCarro());

	}

	private static Factory getFactory(Pedido pedido) {
		if(pedido.getTipoCarro().equals("Luxo")){
			return new CarrosLuxoFactory();
		}else {
			return new CarrosPopularFactory();
		}
	}

}
