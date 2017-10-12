package Heranca;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Aluno extends Pessoa{
	
	private int matricula;
	private String curso;
		
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void cancelarMtricula(){
			System.out.println("Matrícula cancelada");
		
	}
	
	public void pagarMensalidade(){
		
		System.out.println("pagando mensalidade");
	}
	
	
		
	
	

}
