package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColeacoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		javaColeacoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColeacoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColeacoes.adiciona(new Aula("Modelando com corre��es", 24));
		
		List<Aula> aulasImutaveis = javaColeacoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);	
		System.out.println(javaColeacoes.getTempoTotal());	
		
		System.out.println(javaColeacoes);
		
	}

}
