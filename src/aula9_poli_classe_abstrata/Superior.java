package aula9_poli_classe_abstrata;

public class Superior extends Aluno implements Estudos{

	private Double n3;
	private Double inter;
		
	public Double getN3() {
		return n3;
	}

	public void setN3(Double n3) {
		this.n3 = n3;
	}

	public Double getInter() {
		return inter;
	}

	public void setInter(Double inter) {
		this.inter = inter;
	}

	@Override
	public void calcMedia() {
		setMedia((getN1()+getN2()+n3+inter)/3.5);
	}
	
	public void calcStatus() {
		if(getMedia() < 5)
			setStatus("Reprovado");
		else
			setStatus("Aprovado");
	}

	@Override
	public void estudar() {
		System.out.println("Ensinar a quem queria aprender o conteúdo!");
	}

	@Override
	public void formar() {
		System.out.println("Estudar todos os dias, ser comunicativo, ser humilde !");	
	}

}
