package desafio;

public class pessoa {
	double pesoPessoa;
	String nomePessoa;
	
	pessoa(String nomePessoa,double pesoPessoa){
		this.nomePessoa=nomePessoa;
		this.pesoPessoa=pesoPessoa;
	}
	
	// CRIANDO O METODO COMER;
	
	void comer(comida Comida) {
		if (Comida !=null) {
			this.pesoPessoa+=Comida.peso;
		}
	}
	String apresentar() {
		return "olá eu sou o " + nomePessoa+ " e tenho " + pesoPessoa +"kgs.";
	}
}
