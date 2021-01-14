package func;

public class Comissionado extends Funcionario {
	protected float salarioBase;
	protected float comissao;
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public float calcularSalario () {
		this.salarioBase += salarioBase*comissao/100;
		return this.salarioBase;
	}
	public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
				
		// TODO Auto-generated constructor stub
	}
	
	

}
