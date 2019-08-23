package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException();
		}
		
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	// Sempre que se reescreve o método equals reescreve o método hashcode (obrigatório)
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}

	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	@Override
	public String toString() {
		return "[Aluno nome:" + this.nome + ", Matricula:" + this.numeroMatricula + "]";
	}

}
