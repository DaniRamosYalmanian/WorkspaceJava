
public class lojateste {
 public static void main(String[] args) {
	Produto prod1 = new Produto(1,"Computador",1000.00);
	Produto prod2 = prod1;
	
	System.out.println(prod1.exibirInfo());
	System.out.println(prod2.exibirInfo());
	
	
}
}
