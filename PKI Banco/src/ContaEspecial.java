
public class ContaEspecial extends Conta{
	private float limite;
	
    public boolean debitar (float valor) {
		  if ((getSaldo() + getLimite()) >= valor) {		  
			  this.saldo -= valor;
			  return true;
		  } else {
			  return false;
		  }
	  }

    public String exibirInfo() {
  	  return ("Nome:" + this.nomeTitular + " - CPF: " + this.cpf + " - Conta: " + this.numeroConta + " - Limite: " + this.limite + " - Saldo: %.2f/n" + this.saldo);
    }
  	
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	

}
