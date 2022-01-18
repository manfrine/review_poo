package aula7_encapsulamento;

public class Marca {
	private int id;
	private String nome;
	
	public Marca() {
		
	}
	
	public Marca(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
