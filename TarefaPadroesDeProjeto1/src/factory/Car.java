package factory;

public abstract class Car {

	private int potencia;
	private String combustivel;
	private String cor;

	public Car(int potencia, String combustivel, String cor) {
		this.potencia = potencia;
		this.combustivel = combustivel;
		this.cor = cor;
	}
	
	public void dadosDoVeiculo() {
		System.out.println("--- Dados do Veículo ----");
		System.out.println("Veículo: " + getClass().getSimpleName());
		System.out.println("Potência: " + potencia + " Cavalos");
		System.out.println("Combustivel: " + combustivel);
		System.out.println("Cor: " + cor);
		System.out.println();
	}
	
	public void montarVeiculo() {
		System.out.println("--- Iniciando Processo de Montagem ----");
		System.out.println("Montando o Veículo [...]");
	}
	
	public void encherTanque() {
		System.out.println("Enchendo o tanque [...]");
	}
	
	public void limpar() {
		System.out.println("Limpando Veículo [...]");
	}
	
	public void finalizar() {
		System.out.println("Processo Finalizado");
	}
	
	
}
