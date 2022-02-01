package ProjetoCalculadora;

public class calculadora {
	
	// CRIANDO OS METODOS;
	
	public static void soma(double numero1, double numero2) {
		double resultado = numero1+numero2;
		System.out.println("A Soma dos Valores: "+resultado);
	}
	
	public static void subtracao(double numero1, double numero2) {
		double resultado = numero1-numero2;
		System.out.println("A subtracao dos Valores: "+resultado);
	}
	
	public static void multiplicacao(double numero1, double numero2) {
		double resultado = numero1*numero2;
		System.out.println("A multiplicacao dos Valores: "+resultado);
	}
	
	public static void divisao(double numero1, double numero2) {
		double resultado = numero1/numero2;
		System.out.println("A Divisão dos Valores: "+resultado);
	}
	
	public static void raizQuadrada(double numero1) {
		double resultado = Math.sqrt(numero1);
		System.out.println("A Raiz Quadrada é:"+resultado);
	}
	
	public static void elevado(double numero1, double numero2) {
		double resultado = Math.pow(numero1, numero2);
		System.out.println(numero1+" Elevado a "+numero2+" é: "+resultado);
	}

}
