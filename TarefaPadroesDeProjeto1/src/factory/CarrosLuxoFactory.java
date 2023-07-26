package factory;

public class CarrosLuxoFactory extends Factory {

	@Override
	Car tipoCarro(String tipoCarro) {
		if("Luxo".equals(tipoCarro)) {
			return new Honda(5000,"Hibrido", "Prata");
		}else {			
			return null;
		}
	}


}
