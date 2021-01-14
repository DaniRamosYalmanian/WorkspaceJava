
public class Time {
	private int hora;
	private int minuto;
	private int segundo;
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public void setTime(int h, int m, int s) {
		
		if (h <= 24 && m <= 60 && s <= 60) {
			this.hora = h;
			this.minuto = m;
			this.segundo = s;
		} else {
			System.out.println("Hora inválida!!!");
		}		
		
	}
	
	public String exibirHoraUniversal () {
		return (formatarNumero(hora) + ":" + formatarNumero(minuto) + ":" + formatarNumero(segundo));
	}
	
	public String exibirHoraPadrao () {
	 if (hora < 12) {
		 	if (hora == 0) {
		 		return ("12:" + formatarNumero(minuto) + ":" + formatarNumero(segundo) + " PM");
		 	} else {
		 		return (formatarNumero(hora) + ":" + formatarNumero(minuto) + ":" + formatarNumero(segundo) + " AM");
		 	}
		} else {
			return (formatarNumero(hora - 12 )+ ":" + formatarNumero(minuto) + ":" + formatarNumero(segundo) + " PM");
		}
	}
	
	public String formatarNumero (int num) {
		String res;
		if (num < 10 ) {
			res = "0" + num;
		} else {
			res = num + "";
		}
		return res;
	}

	
}
