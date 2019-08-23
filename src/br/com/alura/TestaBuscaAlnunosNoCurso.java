package br.com.alura;

import java.util.Map;
import java.util.Set;

public class TestaBuscaAlnunosNoCurso {

	public static void main(String[] args) {
		Curso javaColeacoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColeacoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColeacoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColeacoes.adiciona(new Aula("Modelando com correções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silvera", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		Aluno a4 = new Aluno("Paulo Silveira", 5617);		
		
		javaColeacoes.matricula(a1);
		javaColeacoes.matricula(a2);
		javaColeacoes.matricula(a3);
		javaColeacoes.matricula(a4);		

		System.out.println(javaColeacoes.getAlunos());
		System.out.println("Quem é o aluno com matricula 5617?");
		Aluno aluno = javaColeacoes.buscaMatriculado(5617);
		System.out.println("aluno: " + aluno);	
		
		Map<Integer, Set<Aluno>> matriculaParaAlunos;
		
	}

}
