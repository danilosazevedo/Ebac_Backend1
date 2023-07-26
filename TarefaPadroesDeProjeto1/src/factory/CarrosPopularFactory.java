package factory;

public class CarrosPopularFactory extends Factory {

	@Override
	Car tipoCarro(String tipoCarro) {
		if("Popular".equals(tipoCarro)) {
			return new Gol(100,"Gasolina", "Preto");
		}else {			
			return null;
		}
	}

}
