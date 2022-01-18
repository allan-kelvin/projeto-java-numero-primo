import java.util.Scanner;
public class primos1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um Numero Para ser Verificado se é Primo!");
        int numero = entrada.nextInt();
        
        int contador=0;
        
        for (int i=1; i<=numero; i++){
            if (numero % i ==0){
                contador++;
            }
        }
        

        if (contador==2){
            System.out.printf("O numero %s é Primo",numero);
        }else{
            System.out.printf("O numero %s não é Primo",numero);
        }
		
	}

}
