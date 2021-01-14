package ui;

import core.BDMySQL;
import core.interfaceBD;

public class Sistema {
  public static void main(String[] args) {
	interfaceBD ibd = new BDMySQL;
	
	ibd.conectar("admin", "bd_sistema");
	ibd.executar("Select * from  clientes");
	ibd.desconectar("bd_sistema");
}
}
