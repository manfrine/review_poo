package aula8_encapsulamento_agregacao;

public class Funcionario {

	private Integer funid;
	private String funnome;
	private Double funsalario;
	private Bairro funbairro;
	private Setor funsetor;
	
	public void setFunid(Integer funid) {
		this.funid = funid;
	}
	
	public Integer getFunid() {
		return funid;
	}
	
	public void setFunnome(String funnome) {
		this.funnome = funnome;
	}
	
	public String getFunnome() {
		return funnome;
	}
	
	public void setFunbairro(Bairro funbairro) {
		this.funbairro = funbairro;
	}
	
	public Bairro getFunbairro() {
		return funbairro;
	}
	
	public Double getFunsalario() {
		return funsalario;
	}
	
	public void setFunsetor(Setor funsetor) {
		this.funsetor = funsetor;
	}
	
	public Setor getFunsetor() {
		return funsetor;
	}
	
	public void calcSalario() {
		 if(funsetor.getSetsigla().equals("TI")) {
			funsalario = 4000.0;
		}else if(funsetor.getSetsigla().equals("ADM")) {
			funsalario = 3000.0;
		}else if(funsetor.getSetsigla().equals("LOG")) {
			funsalario = 2500.0;
		}else {
			funsalario = 2000.0;
		}
	}
	
	public void calcSalario(String a) {
		if(funbairro.getBainome().equals("Centro")) {
			funsalario = 2000.0;
		}else if(funbairro.getBainome().equals("Zumbi")) {
			funsalario = 3000.0;
		}else if(funbairro.getBainome().equals("Monte das Oliveiras")) {
			funsalario = 4000.0;
		}else {
			funsalario = 1500.0;
		}
	}
	
}
