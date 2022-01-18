package aula9_polimorfismo;

public class Vendedor {

	private String nome;
	private String cpf;
	private Double salario;
	private Double comissao;
	private Double vendas;
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getVendas() {
		return vendas;
	}

	public void setVendas(Double vendas) {
		this.vendas = vendas;
	}
	
	void calcSalario() {
		salario = 1000+comissao;
	}
	
	void calcComissao() {
		if(vendas <= 10000) {
			comissao = vendas*1/100;
		}else {
			comissao = vendas*2/100;
		}
	}
	
	
	void calcComissao(double valor) {
		if(vendas <= 15000) {
			comissao = vendas*1/100;
		}else if(vendas < 30000){
			comissao = vendas*2/100;
		}else {
			comissao = vendas*4/100;
		}
	}
	
	
}
