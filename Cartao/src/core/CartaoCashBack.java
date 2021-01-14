package core;

public class CartaoCashBack extends CartaoPrePago {
	// 0 - Gold / 1- Silver/ 2- Bronze
	private int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "CartaoCashBack [tipo=" + tipo + ", numeroCartao=" + numeroCartao + ", nomeTitular=" + nomeTitular
				+ ", anoValidade=" + anoValidade + ", mesValidade=" + mesValidade + ", saldo=" + saldo + "]";
	}

	public boolean comprarCredito (double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			
			if (tipo == 0)  {
				super.saldo += valor * 0.08;
			} else if (tipo == 1)  {
				super.saldo += valor * 0.05;
			} else if (tipo == 2)  {
				super.saldo += valor * 0.02;
			}
			return true;
		}
		return false;
	}
	
	
	

	

	
	
	

}
