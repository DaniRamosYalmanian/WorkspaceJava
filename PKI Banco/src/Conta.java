

public class Conta {
  protected String nomeTitular;
  protected String cpf;
  protected int numeroConta;
  protected float saldo;
  
  public Conta (String nomeTitular, String cpf, int numeroConta, float d){
	  this.nomeTitular = nomeTitular;
	  this.cpf = cpf;
	  this.numeroConta =numeroConta;
	  this.saldo =d;
	 }
  
  public boolean debitar (float valor) {
	  if (getSaldo() >= valor) {		  
		  this.saldo -= valor;
		  return true;
	  } else {
		  return false;
	  }
  }

  public void creditar (float valor) {
	  this.saldo += valor;
  }
  
  public String exibirInfo() {
	  return ("Nome:" + this.nomeTitular + " - CPF: " + this.cpf + " - Conta: " + this.numeroConta + " - Saldo: %.2f/n" + this.saldo);
  }
		  
  
public String getNomeTitular() {
	return nomeTitular;
}
public void setNomeTitular(String nomeTitular) {
	this.nomeTitular = nomeTitular;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public int getNumeroConta() {
	return numeroConta;
}
public void setNumeroConta(int numeroConta) {
	this.numeroConta = numeroConta;
}
public float getSaldo() {
	return saldo;
}
public void setSaldo(float saldo) {
	this.saldo = saldo;
}
  
  
}
