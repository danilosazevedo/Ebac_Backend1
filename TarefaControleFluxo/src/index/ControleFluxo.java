package index;

public class ControleFluxo {

	public static void main(String[] args) {
		int nota1 = 5;
		int nota2 = 5;
		int nota3 = 8;
		int nota4 = 9;
		Double media = (nota1+nota2+nota3+nota4)/4d;
		
		if (media >= 7) {
			
			System.out.print("A nota final é" + " " + media + ", " + "Aluno Aprovado");
		} else if (media >=5 && media <7) {
			System.out.print("A nota final é" + " " + media + ", " + "Aluno Em Recuperação");
		} else {
			System.out.print("A nota final é" + " " + media + ", " + "Aluno Reprovado");
		}
	}
}
