import java.util.Scanner;

public class primos2 {
	public static void main(String[] args) {
		
		System.out.println("Digite Um Numero!");
		Scanner entrada = new Scanner(System.in);
		
		int numero =entrada.nextInt();
		
		for (int i=1; i<=numero;i++){
            int cont=0;
            for (int j=1;j<=i; j++){
                if (i%j==0)
                    cont++;
            }
            if (cont==2){
            	System.out.printf("O numero %s � Primo \n",i);    
        }else{
            System.out.printf("O numero %s n�o � Primo \n",i);

        }
	 }
   }
}
