package model;

public class Carro extends Veiculo {
	String modelo;

	public Carro(String marca, String modelo) {
		super(marca);
		this.modelo = modelo;
	}

	public void acelerar() {
		System.out.println("Carro: " + marca + "/" + modelo + " no p�");		
	}
	
	public void frear() {
		System.out.println("Carro: " + marca + "/" + modelo + " na m�o");		
	}
	
	
	
	
}
