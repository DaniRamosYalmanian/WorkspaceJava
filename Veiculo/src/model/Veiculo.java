package model;

public abstract class Veiculo {
	protected String marca;
	
	public abstract void acelerar();
	public abstract void frear();
	
	
	public Veiculo(String marca) {
		super();
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
