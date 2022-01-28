package desafio;

public class jantar {
	public static void main(String[] args) {
		
		comida c1=new comida("arroz", 0.180);
		comida c2=new comida("feijao", 0.300);
		
		pessoa p = new pessoa("allan",99.8);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		
		System.out.println(p.apresentar());
		p.comer(c2);

		
	}

}
