
public class Pessoa {
	protected String nome;
	protected String email;
	protected String fone;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String exibirInfo() {
		return (nome + " | " + email + " | " + fone);
	}
	
}
