package exercicio;

public class Carro {
	/**
	 * @author danil
	 * 
	 * @see Carro
	 */
	
	private String marca;

	private String modelo;
	
	private int ano;
	
	private String cor;
	
	private String combustivel;
	
	private int passageiros;

	public void ligar () {
		System.out.print("on");
	}
	
	public void desligar () {
		System.out.print("off");
	}
	
	public void acelerar () {
		System.out.print("vruuuuuuum");
	}
	
	public void parar () {
		System.out.print("stop");
	}
}
