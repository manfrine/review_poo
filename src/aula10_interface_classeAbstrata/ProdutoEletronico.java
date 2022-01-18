package aula10_interface_classeAbstrata;

public abstract class ProdutoEletronico {

	private String modelo;
	private String fabricante;
	
	public abstract void ligar();
	public abstract void desligar();
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getFabricante() {
		return fabricante;
	}

}
