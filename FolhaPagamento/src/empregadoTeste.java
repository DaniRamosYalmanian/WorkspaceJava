
public class empregadoTeste {

	public static void main(String[] args) {
		
		Empregado emp1, emp2;
		emp1 = new Empregado();
		emp2 = new Empregado();

		emp1.setNome("Mariazinha da Silva");
		emp1.setCargo("Analista de Engenharia de TI");
		emp1.setSalario(5000.00);
		
		emp2.setNome("Joazinho da Silva");
		emp2.setCargo("Analista de Engenharia de TI");
		emp2.setSalario(5500.00);
		
		emp1.imprimir();
		emp2.imprimir();
		
		System.out.println("BOA NOTICIA");

		emp1.aumentarSalario(10);
		emp2.aumentarSalario(15);
		
		emp1.imprimir();
		emp2.imprimir();
	}
		
}
