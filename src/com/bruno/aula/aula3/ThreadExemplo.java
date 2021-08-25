package com.bruno.aula.aula3;

public class ThreadExemplo {

	public static void main(String[] args) {
		Thread thread = new Thread(new barraDeCarregamento2());
		Thread thread2 = new Thread(new barraDeCarregamento3());
		
		thread.start();
		thread2.start();
		
		System.out.println("Nome da thread : "+thread.getName());
		System.out.println("Nome da thread : "+thread2.getName());
	}
}


class gerarPDF extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Gerar PDF");		
	}
}



class barraDeCarregamento extends Thread {
	@Override
	public void run() {
		try {
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Loading ...");		
	}
}



class barraDeCarregamento2 implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("rodei barraDeCarregamento2 : ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}



class barraDeCarregamento3 implements Runnable {
	@Override
	public void run() {	
		try {
			Thread.sleep(1000);
			System.out.println("rodei barraDeCarregamento3 : ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
