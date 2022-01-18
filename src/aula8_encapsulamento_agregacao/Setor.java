package aula8_encapsulamento_agregacao;

public class Setor {

	private Integer setid;
	private String setnome;
	private String setsigla;
	
	public Setor() {
		
	}
	
	public Setor(Integer setid, String setnome, String setsigla) {
		this.setid = setid;
		this.setnome = setnome;
		this.setsigla = setsigla;
	}
	
	
	//setar ou inserir dados
	public void setSetid(Integer setid) {
		this.setid = setid;
	}
	//retornar dados
	public Integer getSetid() {
		return setid;
	}
	
	public void setSetnome(String setnome) {
		this.setnome = setnome;
	}
	public String getSetnome() {
		return setnome;
	}
	
	public void setSetsigla(String setsigla) {
		this.setsigla = setsigla;
	}
	public String getSetsigla() {
		return setsigla;
	}
}
