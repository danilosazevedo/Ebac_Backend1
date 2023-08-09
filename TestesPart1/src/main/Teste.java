package main;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

public class Teste {
	@Test
	public void listaPessoas() {
		List<Pessoa> lista = new Pessoa().Pessoas();
		List<Pessoa> pessoasFeminino = lista.stream()
				.filter(pessoa -> pessoa.getSexo().equals("Feminino"))
				.collect(Collectors.toList());
		
		pessoasFeminino.forEach(pessoa -> System.out.println(pessoa));

		 pessoasFeminino.forEach(pessoa -> Assert.assertEquals("Feminino", pessoa.getSexo()));
		 
	}

}
