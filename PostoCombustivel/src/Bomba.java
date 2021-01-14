
public class Bomba {
	private int codigo;
	private String combustivel;
	private double valorLitro;
	private double qtdLitroBombaInicial;
	private double qtdLitros;
	private double valorTotal;
	private double qtdLitroBombaFinal;
	
	public Bomba (int codigo, String combustivel, double valorLitro, double qtdLitroBombaInicial) {
		this.setCodigo(codigo);
		this.setCombustivel(combustivel);
		this.setValorLitro(valorLitro);
		this.setQtdLitroBombaInicial(qtdLitroBombaInicial);
		this.setQtdLitroBombaFinal(qtdLitroBombaInicial);
	}
	
	public double getQtdLitroBombaInicial() {
		return qtdLitroBombaInicial;
	}

	public void setQtdLitroBombaInicial(double qtdLitroBombaInicial) {
		this.qtdLitroBombaInicial = qtdLitroBombaInicial;
	}

	public double getQtdLitroBombaFinal() {
		return qtdLitroBombaFinal;
	}

	public void setQtdLitroBombaFinal(double qtdLitroBombaFinal) {
		this.qtdLitroBombaFinal = qtdLitroBombaFinal;
	}

	public boolean abastecerLitros(double qtdLitros) {
		if (this.getQtdLitroBombaFinal() >= qtdLitros) {
			this.setQtdLitros(qtdLitros);
			this.setValorTotal(this.getQtdLitros()*this.getValorLitro());
			this.setQtdLitroBombaFinal ( this.getQtdLitroBombaFinal() - qtdLitros);
			return true;
		} else { 
			return false;
		}
	}
		
	public boolean abastecerValor(double valorTotal) {
		this.setValorTotal(valorTotal);
		this.setQtdLitros(this.getValorTotal()/this.getValorLitro());
		if (this.getQtdLitroBombaFinal() >= qtdLitros) {
			this.setQtdLitroBombaFinal ( this.getQtdLitroBombaFinal() - qtdLitros);
			return true;
		} else { 
			return false;
		}
	}
	
	public double getQtdLitros() {
		return qtdLitros;
	}

	public void setQtdLitros(double qtdLitros) {
		this.qtdLitros = qtdLitros;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String exibirRecibo() {
		return ("    RECIBO DO ABASTECIMENTO" + 
				"\n*********************************" + 
				this.getCodigo() + " - " + this.getCombustivel() + 
				"\nValor do litro: R$ " + this.getValorLitro() + " x Qtd de litros: " + this.getQtdLitros() + 
				"\nValor Total: R$ " + this.getValorTotal() +
				"\n*********************************");
	}

	public String exibirRelatorio() {
		return ("    RELATORIO DA BOMBA - CODIGO: " + this.getCodigo() + " - COMBUSTIVEL: " + this.getCombustivel() + 
				"\n***********************************************************" +
				"\nValor do litro da bomba: R$ " + this.getValorLitro() + 
				" x Qtd de litros abastecidos : " + ( this.getQtdLitroBombaInicial() - this.getQtdLitroBombaFinal()) + 
				"\nValor Total vendido nesta bomba: R$ " + ( (this.getQtdLitroBombaInicial() - this.getQtdLitroBombaFinal()) * this.getValorLitro() ) + 
				"\n Qtd de litros disponiveis: " + this.getQtdLitroBombaFinal());
	}

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public double getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(double valorLitro) {
		this.valorLitro = valorLitro;
	}

	
		
	
	
	
	
	
}
