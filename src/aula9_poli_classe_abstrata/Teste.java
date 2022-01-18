package aula9_poli_classe_abstrata;

public class Teste {

	public static void main(String[] args) {

		Medio m = new Medio();
		Tecnico t = new Tecnico();
		Superior s = new Superior();
		
		m.setNome("Fernanda");
		m.setN1(7.0);
		m.setN2(7.0);
		m.setN3(5.0);
		m.calcMedia();
		m.calcStatus();

		t.setNome("Maria");
		t.setN1(6.0);
		t.setN2(9.0);
		t.setN3(3.0);
		t.setN4(5.0);
		t.calcMedia();
		t.calcStatus();
		
		s.setNome("Tereza");
		s.setN1(6.0);
		s.setN2(5.0);
		s.setN3(3.0);
		s.setInter(1.0);
		s.calcMedia();
		s.calcStatus();
		
		System.out.println("O aluno ens. médio: "+m.getNome());
		System.out.println("A media: "+m.getMedia());
		System.out.println("O status: "+m.getStatus());
		m.estudar();
		m.formar();
		
		System.out.println("\nO aluno ens. técnico: "+t.getNome());
		System.out.println("A media: "+t.getMedia());
		System.out.println("O status: "+t.getStatus());
		
		System.out.println("\nO aluno ens. superior: "+s.getNome());
		System.out.println("A nota da inter: "+s.getInter());
		System.out.println("A media: "+s.getMedia());
		System.out.println("O status: "+s.getStatus());
		s.estudar();
		s.formar();
	}

}
