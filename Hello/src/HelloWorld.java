import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a;
		System.out.println("Hello World!!!");
		System.out.println("Digite o valor de a:");
		a = teclado.nextInt();
		System.out.println("Valor digitado = "+ a);
		teclado.close();
	}
}
