package com.bruno.aula.aula2;

import java.util.function.Consumer;

/**Interface funcional que recebe um parametro e não
   retorna nada **/
public class Consumidores {
	public static void main(String[] args) {
	
		//Method Reference 
//			-esconde o parametro
//			-recebe a função em forma de variável
		Consumer<String> imprimirUmaFraseMethodReference = System.out::println;
		
		Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
		
		imprimirUmaFraseMethodReference.accept("Hello World");
		imprimirUmaFrase.accept("Hello world sem method reference");
	}
}
