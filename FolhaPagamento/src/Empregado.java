
public class Empregado {
	private String nome;
	private String cargo;
	private Double salario;
	
	void imprimir () {
		
		System.out.println("Nome   : " + nome + " ( " + cargo + " ) - R$: " + salario);
		
	}
	
	void aumentarSalario (double percentual) {
		salario= salario + salario * (percentual/100);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	

	
}

