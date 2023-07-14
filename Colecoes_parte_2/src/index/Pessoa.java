package index;

public class Pessoa implements Comparable<Pessoa> {
	@Override
	public String toString() {
		return nome +"-"+ sexo;
	}

	private String nome;
	private String sexo;
	
	public Pessoa(String nome, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}
	
    public String getNome() {
        return this.nome;
    }

    public String getSexo() {
        return this.sexo;
    }

	@Override
	public int compareTo(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(pessoa.getNome());
	}

}
