package Heranca;

public class Main {

	public static void main(String[] args) {
		
		//	Visitante v1 = new Visitante();
			Aluno a1 = new Aluno();
			
			Professor p2 = new Professor();
			
			Funcionario p4 = new Funcionario();
			
			
			a1.setNome("Maria");
			p2.setNome("Claudio");
			p4.setNome("Fabiana");
			
			
			a1.setSexo("F");
			p2.setSexo("M");
			p4.setSexo("F");
			
			Bolsista b1 = new Bolsista();
			
			b1.setNome("thais");
			b1.setBolsa(1200f);
			
			
		
			
			System.out.println(a1.toString());
			System.out.println(p4.toString());
			System.out.println(p2.toString());
			

	}

}
