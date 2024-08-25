package DesafioControllerFluxo;

import java.util.Scanner;



public class Contador {
	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm=ler.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois=ler.nextInt();
		
		
		try {
			contar(parametroUm,parametroDois);
		}catch(ParametrosInvalidosException e) {
			System.out.println(e);
		}
	}
	

	
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		
		if(parametroUm> parametroDois){
			throw new ParametrosInvalidosException();
		}
		int contador= parametroDois-parametroUm;
		for(int i=0;i<contador;i++) {
			System.out.println("Imprimindo o numero "+(i+1));
		}
		
	}
}

