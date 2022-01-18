package aula9_polimorfismo;

public class VenCelular extends Vendedor{

	private String DiaFolga = "Terça-Feira";
	private String desconto;
	public String getDiaFolga() {
		return DiaFolga;
	}
	public void setDiaFolga(String diaFolga) {
		DiaFolga = diaFolga;
	}
	public String getDesconto() {
		return desconto;
	}
	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}

	void calcComissao() {
		if(getVendas() <= 25000) {
			setComissao(getVendas()*3/100);
		}if(getVendas() <= 35000) {
			setComissao(getVendas()*4/100);
		}else {
			setComissao(getVendas()*5/100);
		}
	}
	
	void calcSalario() {
		setSalario(1500+getComissao());
	}
	
	
}
