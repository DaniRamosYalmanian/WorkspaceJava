package ui;

import java.util.ArrayList;

import func.Chefe;
import func.Comissionado;
import func.Empreteiro;
import func.Funcionario;
import func.Horista;

public class ListaFuncionarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*	 
	 ListaFuncionario = new Funcionario[4];
	 
	 ListaFuncionario[0] = new Chefe("Leonardo Caldeira",1,1000,1000,1000);
	 ListaFuncionario[1] = new Comissionado("Daniela Ramos",2,1000,1000);
	 ListaFuncionario[2] = new Empreteiro("Carlos Melchior",3,1000);
	 ListaFuncionario[3] = new Horista("Matheus",4,50,220);
	 
	 for (int i=0; i<4;  i++) {
		 System.out.println(ListaFuncionario[i].exibirInfo());
	 }
	 
	
	 */

		ArrayList<Funcionario> ListaFuncionario = new ArrayList<Funcionario>();
		
		ListaFuncionario.add(new Chefe("Leonardo Caldeira",1,1000,1000,1000));
		ListaFuncionario.add(new Comissionado("Daniela Ramos",2,1000,1000));
		ListaFuncionario.add(new Empreteiro("Carlos Melchior",3,1000));
		ListaFuncionario.add(new Horista("Matheus",4,50,220));
	
	
	 System.out.println("outra maneira de imprimir\n");
	 for (Funcionario f: ListaFuncionario) {
		 System.out.printf("%d %s %8.2f\n", f.getNumeroRegistro(), f.getNome(), f.calcularSalario());
	 }
		
	}
}

