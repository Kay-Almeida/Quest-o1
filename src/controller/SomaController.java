package controller;

public class SomaController {
	
	public SomaController () {
		super();
	}
	
	public int SomaFuncao (int a, int b) {
		// condição de parada dada pelo retorno do numero x1 é ele mesmo
		if(b==1) {
			return a; 
		}else {
			// a função está somando nela mesma o valor até a condição de parada 
			return a + SomaFuncao(a, b-1);
			
		}
	}
	
	
}
