
public class Estudante extends Pessoa {
  private String numMatricula;
  private String curso;
public String getNumMatricula() {
	return numMatricula;
}
public void setNumMatricula(String numMatricula) {
	this.numMatricula = numMatricula;
}
public String getCurso() {
	return curso;
}
public void setCurso(String curso) {
	this.curso = curso;
}
  
public String exibirInfo() {
 	return (nome + " | " + email + " | " + fone +  " | " + numMatricula + " | " + curso);
}
}
