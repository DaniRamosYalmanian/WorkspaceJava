
public class Carro {
	String marcaModelo;
	int ano;
	String cor;
	double preco;
	int km;
	int finalPlaca;
	
	void exibirAnuncio() {
		System.out.println("**************************************************");
		System.out.println("Automóvel ");
		System.out.println("Marca/Modelo:" + marcaModelo + " - Ano: " + ano);
		System.out.println("Cor" + cor);
		System.out.println("Final Placa:" + finalPlaca + " KM: " + km);
		System.out.println("Preco: " + preco);
		System.out.println("**************************************************");
		
	}
	
	// carros abaixo de 2000 -> não pagam
	// carros acima de 2000 -> 4,5% do valor do carro
	double calcularIPVA() {
		double valorIPVA;
		
		if (ano < 2000) {
			valorIPVA = 0.00;
		} else {
			valorIPVA = preco * 0.045;
		}
		return valorIPVA;
	}
	
	void aplicarDesconto(double desconto) {
		preco = preco - preco-desconto/100;
	}
}
