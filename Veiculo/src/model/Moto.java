package model;

public class Moto extends Veiculo {
	protected String tipo;

	public Moto(String marca, String tipo) {
		super(marca);
		this.tipo = tipo;
		// TODO Auto-generated constructor stub
	}
	
	public void acelerar() {
		System.out.println("Moto: " + marca + "/" + tipo + " no pé");		
	}
		
	public void frear() {
		System.out.println("Moto: " + marca + "/" + tipo + " na mão");		
	}
		
		
		
		


	
	
	

}
