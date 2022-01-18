package aula9_poli_classe_abstrata;

public abstract class Aluno {

	private String nome;
	private Double n1;
	private Double n2;
	private Double media;
	private String status;
	
	public Double getMedia() {
		return media;
	}
	public void setMedia(Double media) {
		this.media = media;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public Double getN1() {
		return n1;
	}

	public void setN1(Double n1) {
		this.n1 = n1;
	}

	public Double getN2() {
		return n2;
	}

	public void setN2(Double n2) {
		this.n2 = n2;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public abstract void calcMedia();
	
	public void calcStatus() {
		if(media < 4) {
			status = "Reprovado";
		}else if(media < 6) {
			status = "Recuperação";
		}else {
			status = "Aprovado";
		}
	}
}
