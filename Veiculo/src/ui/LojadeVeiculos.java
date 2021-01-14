package ui;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class LojadeVeiculos {
	public static void main(String[] args) {
		
		Veiculo v1,v2;
		
		Veiculo v1 = new Carro("Fusquinha","Poisé");
		Veiculo v2 = new Moto("Yamaha");
		
		v1.acelerar();
		v1.frear();
		v2.acelerar();
		v2.frear();
		
	}

}
