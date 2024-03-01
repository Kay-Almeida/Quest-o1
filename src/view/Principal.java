package view;

import controller.SomaController;

public class Principal {
	public static void main(String[] args) {
		
		SomaController sm = new SomaController();
		
		int a = 5; 
		int b = 7; 
		
		int resultado = sm.SomaFuncao(a, b);
		System.out.println("Resultado da Multiplicação entre "+ a +" e " + b + " é: "+ resultado);
		
		
		
	}

}
