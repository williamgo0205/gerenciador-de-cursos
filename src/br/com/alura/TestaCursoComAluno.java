package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColeacoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColeacoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColeacoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColeacoes.adiciona(new Aula("Modelando com correções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silvera", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColeacoes.matricula(a1);
		javaColeacoes.matricula(a2);
		javaColeacoes.matricula(a3);

		System.out.println("Todos os alunos matriculados:");
		
//		javaColeacoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});	
		
		Set<Aluno> alunos = javaColeacoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		while(iterator.hasNext()) {
			Aluno proximo = iterator.next();
			System.out.println(proximo);
		}
		
		Vector<Aluno> vetor = new Vector<>();
		
//		for(Aluno a : javaColeacoes.getAlunos()) {
//			System.out.println(a);
//		}
		
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColeacoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini está matriculado?");
		System.out.println(javaColeacoes.estaMatriculado(turini));
		
		System.out.println("o a1 é equals ao Turini?");
		System.out.println(a1.equals(turini));
		
		// obrigatoriamente o seguinte é true
		
		System.out.println(a1.hashCode() == turini.hashCode());
	}

}
