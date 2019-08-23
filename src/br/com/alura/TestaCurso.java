package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColeacoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		javaColeacoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColeacoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColeacoes.adiciona(new Aula("Modelando com corre��es", 22));
		
		List<Aula> aulas = javaColeacoes.getAulas();
		
		System.out.println(javaColeacoes.getAulas());		
	}

}
