package danilo;

public class PrimeiraClasse {

	public static void main(String[] args) {
		String ambiente = args[0];
		
		if(ambiente.equals("Danilo")) {
			System.out.print("Olá, Sr." + args[0]);			
		} else if (ambiente.equals("Carlos")){
			System.out.print("Olá, Sr."  + args[0]);	
		}else if (ambiente.equals("José")){
			System.out.print("Olá, Sr."  + args[0]);	
		} else {
			System.out.print("Você não possui cadastro ativo");
		}

	}

}
