
public class Produto {
	private int codi;
	private String desc;
	private double valor;
	
	public Produto (int codi, String desc, double valor) {
		this.setCodi(codi);
		this.setDesc(desc);
		this.setValor(valor);
	}
	
	public String exibirInfo() {
		return (this.getCodi() + " - " + this.getDesc() + " - R$ " + this.valor);
		
	}
	public int getCodi() {
		return codi;
	}

	public void setCodi(int codi) {
		this.codi = codi;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
