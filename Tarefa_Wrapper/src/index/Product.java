package index;

public class Product {
	
    public static void main(String[] args) {
        // Variável primitiva int
        int primitivo = 42;

        // Convertendo para Integer (wrapper)
        Integer wrapper = Integer.valueOf(primitivo);

        // Agora "wrapper" é um Integer
        System.out.println(wrapper);
    }
}
