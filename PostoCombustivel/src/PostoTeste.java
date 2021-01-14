import java.util.Scanner;

public class PostoTeste {
 public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Bomba bomba1 = new Bomba(1,"Gasolina",5.00,1000);
	Bomba bomba2 = new Bomba(2,"Etanol",3.00,1000);
	Bomba bomba3 = new Bomba(3,"Diesel",2.50,1000);
	
	Bomba bombaAtual;
	
	int opcao = 0;
	double valor = 0.00;
	
	do {
		System.out.println("--------------------------------------");	
		System.out.println("Bem vindos ao Posto de Combustível!!!!");
		System.out.println("--------------------------------------");
		System.out.println(bomba1.getCodigo() + " - " + bomba1.getCombustivel() + " - R$ " + bomba1.getValorLitro());
		System.out.println(bomba2.getCodigo() + " - " + bomba2.getCombustivel() + " - R$ " + bomba2.getValorLitro());	
		System.out.println(bomba3.getCodigo() + " - " + bomba3.getCombustivel() + " - R$ " + bomba3.getValorLitro());		
		
		int opcaoBomba = teclado.nextInt();
		
		if (opcaoBomba == 1) {
			bombaAtual = bomba1;
		} else if (opcaoBomba == 2 ) {
			bombaAtual = bomba2;
		} else {
			bombaAtual = bomba3;
		}
		
		System.out.println("1 - Abastecimento por valor");
		System.out.println("2 - Abastecimento por litros");
		System.out.println("3 - Relatório Gerencial");

		opcao = teclado.nextInt();
		if (opcao < 3) {
			System.out.println("Digite o valor:");
			valor = teclado.nextDouble();
		}
		switch(opcao) {
			case 1:
				if (bombaAtual.abastecerValor(valor)) {
					System.out.println(bombaAtual.exibirRecibo());
				} else {
					System.out.println("Quantidade de combustivel na bomba insuficiente");
				}
				break;
			case 2: 
				if (bombaAtual.abastecerLitros(valor)) {
					System.out.println(bombaAtual.exibirRecibo());
				} else {
					System.out.println("Quantidade de combustivel na bomba insuficiente");
				}
				break;
			case 3:
				System.out.println(bombaAtual.exibirRelatorio());
		}	
		
	} while (opcao <=2);
 }
}