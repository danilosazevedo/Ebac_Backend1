package exercicio;

public class CalculoMedia {

	public static void main(String[] args) {
		calculoMedia();

	}

	private static void calculoMedia() {
		int nota1 = 8;
		int nota2 = 10;
		int nota3 = 6;
		int nota4 = 5;
		int media = (nota1+nota2+nota3+nota4)/4;
		
		
		System.out.print("A nota final é" + " " + media);
	}

}
