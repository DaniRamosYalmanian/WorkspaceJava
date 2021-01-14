package func;

public class Empreteiro extends Funcionario {
	protected float valorEmpreita;

	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}

	public Empreteiro(String nome, int numeroRegistro, float valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}

	public float calcularSalario() {
		return (valorEmpreita);
	}
	
}
