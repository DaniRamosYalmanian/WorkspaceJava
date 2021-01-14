package inter;

import core.CartaoCashBack;
import core.CartaoPrePago;

public class Evento {
	public static void main(String[] args) {
	
		CartaoPrePago c1;
		
		c1 = new CartaoPrePago("1111 2222 3333 4444","Teste 1",10,25,1000);
		
			
		CartaoCashBack b1, b2, b3;
		
		b1 = new CartaoCashBack("2222 2222 3333 4444","Teste 1",10,25,1000,0);
		b2 = new CartaoCashBack("3333 2222 3333 4444","Teste 2",10,25,1000,1);
		b3 = new CartaoCashBack("4444 2222 3333 4444","Teste 3",10,25,1000,2);
		
		System.out.println(c1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		c1.comprarCredito(100.00);
		b1.comprarCredito(100.00);
		b2.comprarCredito(100.00);
		b3.comprarCredito(100.00);
		
		System.out.println(c1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
	}
	
	
}
