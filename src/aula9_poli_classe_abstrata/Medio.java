package aula9_poli_classe_abstrata;

public class Medio extends Aluno implements Estudos{

	private Double n3;
	
	public void setN3(Double n3) {
		this.n3 = n3;
	}
	
	public Double getN3() {
		return n3;
	}
	
	@Override
	public void calcMedia() {
		setMedia((getN1()+getN2()+n3)/3);
	}

	@Override
	public void estudar() {
		System.out.println("Todo dia revisar o conteúdo e criar um modelo novo!");
		
	}

	@Override
	public void formar() {
		System.out.println("Fazer todos os trabalhos");
	}
}
