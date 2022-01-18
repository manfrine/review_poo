package aula8_encapsulamento_agregacao;

public class Bairro {

	private Integer baiid;
	private String bainome;
	
	public Bairro() {
		
	}
	public Bairro(Integer baiid, String bainome) {
		this.baiid = baiid;
		this.bainome = bainome;
	}
	
	public void setBaiid(Integer baiid) {
		this.baiid = baiid;
	}
	
	public Integer getBaiid() {
		return baiid;
	}
	
	public void setBainome(String bainome) {
		this.bainome = bainome;
	}
	
	public String getBainome() {
		return bainome;
	}
}
