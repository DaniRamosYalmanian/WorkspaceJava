import java.util.Scanner;
import javax.swing.JOptionPane;

public class timeTeste {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Time tempo1, tempo2;
		String padrao, universal;
		
		tempo1 = new Time();
		tempo2 = new Time();
		
		int h,m,s;
		
		System.out.println("Digite a hora: ");
		tempo1.setHora(teclado.nextInt());
		
		System.out.println("Digite a minuto: ");
		tempo1.setMinuto(teclado.nextInt());
		
		System.out.println("Digite a segundo: ");
		tempo1.setSegundo(teclado.nextInt());
		
		
		/*System.out.println("Digite a hora: ");
		h = teclado.nextInt();
		
		System.out.println("Digite a minuto: ");
		m = teclado.nextInt();
		
		System.out.println("Digite a segundo: ");
		s = teclado.nextInt();
		
		tempo1.setTime(h, m, s);
		*/
		
		padrao = tempo1.exibirHoraPadrao();
		universal = tempo1.exibirHoraUniversal();
				
		System.out.println("Hora Padr�o: " + padrao);
		
		System.out.println("Hora Universal: " + universal);
		
		
	}

	
	 

}