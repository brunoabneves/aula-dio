package com.bruno.aula.aula2;

import java.util.function.Supplier;

//Supplier: Interface funcional que não recebe parametro
//e retorna algo do tipo especificado no generics
public class Supridores {
	public static void main(String[] args) {
		Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
		Supplier<Pessoa> instanciaMethodReference = Pessoa::new;
		
		System.out.println(instanciaPessoa.get());
	}
}

class Pessoa {
	private String nome;
	private Integer idade;
	
	public Pessoa() {
		nome = "Bruno";
		idade = 24;
	}
	
	@Override
	public String toString() {
		return String.format("nome: %s, idade: %d", nome,idade);
	}
}
