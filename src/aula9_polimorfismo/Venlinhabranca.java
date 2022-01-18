package aula9_polimorfismo;

public class Venlinhabranca extends Vendedor{

	private String diaFolga = "Segunda-Feira";
	
	public String getDiaFolga() {
		return diaFolga;
	}
	
	void calcComissao() {
		if(getVendas() <= 15000) {
			setComissao(getVendas()*2/100);
		}if(getVendas() <= 25000) {
			setComissao(getVendas()*3/100);
		}else {
			setComissao(getVendas()*4/100);
		}
	}
	
	void calcSalario() {
		setSalario(1300+getComissao());
	}
	
}
