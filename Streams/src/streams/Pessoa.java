package streams;

	import java.util.List;
	import java.util.Objects;

	public class Pessoa {

	    private String nome;

	    private String sexo;

	    public Pessoa() {

	    }

	    public Pessoa(String nome, String sexo) {
	        this.nome = nome;
	        this.sexo = sexo;
	    }

	    public Pessoa(Pessoa pessoa) {
	        this(pessoa.getNome(), pessoa.getSexo());
	    }





	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getSexo() {
	        return sexo;
	    }

	    public void setSexo(String sexo) {
	        this.sexo = sexo;
	    }

	    public List<Pessoa> Pessoas() {
	        Pessoa pessoa1 = new Pessoa("Matheus Henrique", "Masculino");
	        Pessoa pessoa2 = new Pessoa("Danilo Azevedo", "Masculino");
	        Pessoa pessoa3 = new Pessoa("Luiza Costa", "Feminino");
	        Pessoa pessoa4 = new Pessoa("Maria Duarte", "Feminino");
	        return List.of(pessoa1,pessoa2,pessoa3,pessoa4);
	    }

		@Override
		public String toString() {
			return nome + ", " + sexo;
		}
	    
	    
	}