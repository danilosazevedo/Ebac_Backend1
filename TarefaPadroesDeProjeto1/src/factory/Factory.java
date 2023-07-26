package factory;

public abstract class Factory {
	
	public Car create(String tipoCarro) {
		Car car = tipoCarro(tipoCarro);
		car = prepareCar(car);
		return car;
	}

	public Car prepareCar (Car car) {
		car.dadosDoVeiculo();
		car.montarVeiculo();
		car.encherTanque();
		car.limpar();
		car.finalizar();
		return car;
	}
	
	abstract Car tipoCarro(String tipoCarro);
}
