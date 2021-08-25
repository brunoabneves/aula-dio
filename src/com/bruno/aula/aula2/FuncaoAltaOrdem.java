package com.bruno.aula.aula2;


public class FuncaoAltaOrdem {
	public static void main(String[] args) {
		
		Calculo soma = (a, b) -> a+b;
		Calculo subtracao = (a, b) -> a-b;
		Calculo multiplicacao = (a, b) -> a*b;
		Calculo divisao = (a, b) -> a/b;
		//System.out.println(multiplicacao.calcular(2, 3));
		System.out.println(executarOperacao(soma, 2, 4)); //6
		System.out.println(executarOperacao(subtracao, 4, 2)); //2
		System.out.println(executarOperacao(multiplicacao, 2, 4)); //8
		System.out.println(executarOperacao(divisao, 6, 2)); //3
	}
	
	public static int executarOperacao(Calculo calculo, int a, int b) {
		return calculo.calcular(a, b);
	}
}

@FunctionalInterface
interface Calculo {
	public int calcular(int a, int b);
}
