package func;

public class Horista extends Funcionario {
	protected float valorHora;
	protected float numeroHoras;
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public float getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(float numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
	public float calcularSalario() {
		float salarioBase=valorHora*numeroHoras;
		return (salarioBase);		
	}
	public Horista(String nome, int numeroRegistro, float valorHora, float numeroHoras) {
		super(nome, numeroRegistro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	
	
	
}
