package aula7_encapsulamento;

public class Veiculo {

	private int codigo;
	private String modelo;
	private String placa;
	private String cor;
	private double valor;
	private Marca marca;
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;		
	}
	public String getCor() {
		return cor;
	}

	public void setPlaca(String placa) {
		this.placa = placa;		
	}
	public String getPlaca() {
		return placa;
	}

	public void setValor(double valor) {
		this.valor = valor;		
	}
	public double getValor() {
		return valor;
	}

}
