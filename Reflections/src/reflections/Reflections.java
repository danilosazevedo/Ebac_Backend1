package reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Reflections {

	public static void main(String[] args) {

		Annotation[] tabela  = TabelaCliente.class.getDeclaredAnnotations();
		for (Annotation an : tabela) {
			System.out.println("Conteúdo da Annotation: " + an.annotationType());
		}

	}

}
