package aula9_poli_classe_abstrata;

public class Tecnico extends Medio{
	
	private Double n4;
	
	public Double getN4() {
		return n4;
	}
	
	public void setN4(Double n4) {
		this.n4 = n4;
	}
	
	public void calcMedia() {
		setMedia((getN1()+getN2()+getN3()+n4)/4);
	}

}
