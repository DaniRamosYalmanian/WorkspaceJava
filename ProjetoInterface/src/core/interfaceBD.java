package core;

public interface interfaceBD {
	public void conectar (String usuario, String bancodeDados);
	public void executar (String comando);
	public void desconectar (String bancodeDados);
}
