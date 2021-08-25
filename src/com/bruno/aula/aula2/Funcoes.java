package com.bruno.aula.aula2;

import java.util.function.Function;

/**Interface funcional que recebe um parametro e retorna
 * um parametro **/
public class Funcoes {
	public static void main(String[] args) {
		Function<String, String> retornarNomeAoContrario = nome -> new StringBuilder(nome).reverse().toString();
		Function<String, Integer> converterStringParaInteiro = string -> Integer.valueOf(string);
		
		System.out.println(retornarNomeAoContrario.apply("Bruno"));
		System.out.println(converterStringParaInteiro.apply("20"));
	}
}