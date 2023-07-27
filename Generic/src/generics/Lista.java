package generics;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String args[]) {
		
		
		List<ICarro> veiculos = new ArrayList();
		veiculos.add(new HondaCity());
		veiculos.add(new HondaCivic());
		veiculos.add(new HondaHRV());
		exibirVeiculos(veiculos);
	}

	public static void exibirVeiculos(List<? extends ICarro> list) {
			for (ICarro carro : list) {
				System.out.println(carro);
			}
	}

}
