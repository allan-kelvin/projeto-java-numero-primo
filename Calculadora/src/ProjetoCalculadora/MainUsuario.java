package ProjetoCalculadora;

import java.util.Scanner;

public class MainUsuario {
	public static void main(String[] args) {
		
		Scanner entradaNumero = new  Scanner(System.in);
		
		System.out.println("Digite um Numero");
		Double numero1 = entradaNumero.nextDouble();
		
		System.out.println("Digite um Outro Numero");
		Double numero2 = entradaNumero.nextDouble();
		
		System.out.println("Qual Operacao Deseja Realizar ?");
		System.out.println("1- Soma \n 2-Subtra��o \n 3-Muliplica��o \n 4-Divis�o \n");
		
		Scanner escolhaDaConta = new Scanner(System.in);
		
		int opcao = escolhaDaConta.nextInt();
		
		switch (opcao) {
		case 1: {
			
			calculadora.soma(numero1, numero2);
			break;	
		}
		
		case 2:{
			calculadora.subtracao(numero1, numero2);
			break;
		}
		
		case 3:{
			calculadora.multiplicacao(numero1, numero2);
			break;
		}
		
		case  4:{
			calculadora.divisao(numero1, numero2);
		}
		default:
			System.out.println("Valor Digitado Invalido");
		}
		entradaNumero.close();
		escolhaDaConta.close();
		
		
	}

}
