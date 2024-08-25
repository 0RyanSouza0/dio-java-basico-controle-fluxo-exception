package DesafioControllerFluxo;

public class ParametrosInvalidosException extends Exception{

	
	ParametrosInvalidosException(){
		System.out.println("O segundo parâmetro de ser maior que o primeiro ");
	}
}
