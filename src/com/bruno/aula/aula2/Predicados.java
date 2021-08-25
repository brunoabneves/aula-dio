package com.bruno.aula.aula2;

import java.util.function.Predicate;

//Predicates: interface funcional que recebe um parametro qualquer
//e retorna um boolean
public class Predicados {

	public static void main(String[] args) {
		Predicate<String> estaVazio = valor -> valor.isEmpty();
		Predicate<String> estaVazioMethodReference = String::isEmpty;
		
		System.out.println(estaVazio.test("")); //true
		System.out.println(estaVazio.test("Bruno")); //false
		System.out.println(estaVazioMethodReference.test("")); //true
		System.out.println(estaVazioMethodReference.test("Araújo")); //false
	}
}
