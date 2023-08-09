package main;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

	public static void main(String[] args) {
		List<Pessoa> lista = new Pessoa().Pessoas();
		List<Pessoa> pessoasFeminino = lista.stream()
				.filter(pessoa -> pessoa.getSexo().equals("Feminino"))
				.collect(Collectors.toList());

		pessoasFeminino.forEach(pessoa -> System.out.println(pessoa));
	}
	

}

