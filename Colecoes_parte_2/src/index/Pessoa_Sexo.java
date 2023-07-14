package index;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pessoa_Sexo {

	public static void main(String[] args) {
		pessoasPorSexo();

	}

	private static void pessoasPorSexo(){

		List<Pessoa> lista = new ArrayList<>();
		Pessoa a = new Pessoa("Danilo Azevedo", "M");
		Pessoa b = new Pessoa("Alcione Costa", "F");
		Pessoa c = new Pessoa("Bruna Silva", "F");
		Pessoa d = new Pessoa("Carlos da Silva", "M");
		Pessoa e = new Pessoa("Raul Azevedo", "M");
		Pessoa f = new Pessoa("Marta Dantas", "F");
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		lista.add(e);
		lista.add(f);
		
		List<Pessoa> listaHomens = new ArrayList<>();
		List<Pessoa> listaMulheres = new ArrayList<>();
		
		for(Pessoa pessoa : lista) {
			if(pessoa.getSexo().equals("M")) {
				listaHomens.add(pessoa);
			}else{
				listaMulheres.add(pessoa);
			}
		}
		
		System.out.println("***Lista Geral**");
		System.out.println(lista);
		System.out.println(" ");

		System.out.println("***Lista Geral Ordenada**");
		Collections.sort(lista);
		System.out.println(lista);
		System.out.println(" ");
		
		System.out.println("***Lista Homens**");
		System.out.println(listaHomens);
		System.out.println(" ");
		
		System.out.println("***Lista Mulheres**");
		System.out.println(listaMulheres);
	}

}
