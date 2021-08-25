package com.bruno.aula.aula2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
	public static void main(String[] args) {
		String[] nomes = {"Bruno", "Bruno", "Araújo", "Braga", "Neves"};
		Integer[] numeros = {1,2,3,4,5};
		
		//imprimirNomesFiltrados(nomes);
		imprimirTodosNomes(nomes);
		imprimirDobroDeCadaItem(numeros);
	}
	
	//forma antes da API de stream. dificil de dar manutenção
	public static void imprimirNomesFiltrados(String... nomes) {
		String nomesParaImprimir = "";
		for(int i = 0; i < nomes.length; i++) {
			if(nomes[i].equals("Bruno")) {
				nomesParaImprimir+=""+nomes[i];
			}
		}
		
		System.out.println("Nomes do for: "+nomesParaImprimir);
		
		String nomesParaImprimirDaStream = Stream.of(nomes)
				.filter(nome -> nome.equals("Bruno"))
				.collect(Collectors.joining());
		
		System.out.println("Nomes do stream: "+nomesParaImprimirDaStream);
	}
	
	public static void imprimirTodosNomes(String... nomes) {
		Stream.of(nomes).forEach(System.out::println);
	}
	
	public static void imprimirDobroDeCadaItem(Integer... numeros) {
		//Stream.of(numeros).forEach(valor -> System.out.println(valor*2));
		//outra forma
		Stream.of(numeros).map(valor -> valor*2)
						   .forEach(System.out::println);
	}
}
