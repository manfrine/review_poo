package aula10_interface_classeAbstrata;

public class Celular extends ProdutoEletronico implements Tocador{

	private int qtdMemoria;
	private String cor;
	
	@Override
	public void ligar() {
		System.out.println("O celular liga com um 'Bom dia' do dono !");
	}

	@Override
	public void desligar() {
		System.out.println("O celular desliga ao ser chacoalhado !");	
	}

	public int getQtdMemoria() {
		return qtdMemoria;
	}

	public void setQtdMemoria(int qtdMemoria) {
		this.qtdMemoria = qtdMemoria;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public void tocar() {
		System.out.println("O iniciar o app de stream, a música começa !");
	}

	@Override
	public void parar() {
		System.out.println("O celular para uma música ao passa a mão sobre a caixa de som !");
	}
	

}
