package index;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pessoa_Sexo {

	public static void main(String[] args) {
//		Criar um programa que leia um nome e o sexo. Separar por grupos M e F
		pessoasPorSexo();

	}

	private static void pessoasPorSexo(){
		System.out.println("***Lista Geral**");

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
		
		System.out.println(lista);
		System.out.println(" ");

		System.out.println("***Lista Homens**");
		Collections.sort(lista);
		System.out.println(lista);
	}

}
