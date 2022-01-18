package aula8_encapsulamento_agregacao;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Setor s1 = new Setor(1, "Tecnologia", "TI");
		Setor s2 = new Setor(2, "Logistica", "LOG");
		Setor s3 = new Setor(3, "Administração", "ADM");
		Setor s4 = new Setor(4, "Direito", "OAB");

		Bairro b1 = new Bairro(1, "Centro");
		Bairro b2 = new Bairro(2, "Monte das Oliveiras");
		Bairro b3 = new Bairro(3, "Zumbi");
		Bairro b4 = new Bairro(4, "Ponta Negra");
		
		Scanner in = new Scanner(System.in);
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		System.out.println("Digite o id do funcionario");
		f1.setFunid(in.nextInt());
		
		System.out.println("Digite o nome do funcionario");
		f1.setFunnome(in.next());
		
		System.out.println("\nO bairro 1: "+b1.getBainome());
		System.out.println("O bairro 2: "+b2.getBainome());
		System.out.println("O bairro 3: "+b3.getBainome());
		System.out.println("O bairro 4: "+b4.getBainome());
		
		System.out.println("\nDigite o numero correspondente ao bairro que vc mora: ");
		int a = in.nextInt();
		
		if(a==1)
			f1.setFunbairro(b1);
		else if(a==2)
			f1.setFunbairro(b2);
		else if(a==3)
			f1.setFunbairro(b3);
		else if(a==4)
			f1.setFunbairro(b4);
		else 
			System.out.println("\n*******  Bairro Inexistente !    *******");
		
		System.out.println("\nO setor 1: "+s1.getSetnome());
		System.out.println("O setor 2: "+s2.getSetnome());
		System.out.println("O setor 3: "+s3.getSetnome());
		System.out.println("O setor 4: "+s4.getSetnome());
		
		System.out.println("\nDigite o numero correspondente ao setor que vc trabalha: ");
		int b = in.nextInt();
		if(b==1)
			f1.setFunsetor(s1);
		else if(b==2)
			f1.setFunsetor(s2);
		else if(b==3)
			f1.setFunsetor(s3);
		else if(b==4)
			f1.setFunsetor(s4);
	
		String palavra = "a";
		System.out.println("\nDigite 1 calcular o salario pelo setor ou 2 p/ calcular pelo bairro: ");
		int c = in.nextInt();
		if(c==1)
			f1.calcSalario();
		else
			f1.calcSalario(palavra);
		
		System.out.println("\n-----------------------------------------");
		System.out.println("Digite o id do funcionario");
		f2.setFunid(in.nextInt());
		
		System.out.println("Digite o nome do funcionario");
		f2.setFunnome(in.next());
		
		System.out.println("\nO bairro 1: "+b1.getBainome());
		System.out.println("O bairro 2: "+b2.getBainome());
		System.out.println("O bairro 3: "+b3.getBainome());
		System.out.println("O bairro 4: "+b4.getBainome());
		
		System.out.println("\nDigite o numero correspondente ao bairro que vc mora: ");
		int aa = in.nextInt();
		
		if(aa==1)
			f2.setFunbairro(b1);
		else if(aa==2)
			f2.setFunbairro(b2);
		else if(aa==3)
			f2.setFunbairro(b3);
		else if(aa==4)
			f2.setFunbairro(b4);
		else 
			System.out.println("\n*******  Bairro Inexistente !    *******");
		
		System.out.println("\nO setor 1: "+s1.getSetnome());
		System.out.println("O setor 2: "+s2.getSetnome());
		System.out.println("O setor 3: "+s3.getSetnome());
		System.out.println("O setor 4: "+s4.getSetnome());
		
		System.out.println("\nDigite o numero correspondente ao setor que vc trabalha: ");
		int bb = in.nextInt();
		if(b==1)
			f2.setFunsetor(s1);
		else if(bb==2)
			f2.setFunsetor(s2);
		else if(bb==3)
			f2.setFunsetor(s3);
		else if(bb==4)
			f2.setFunsetor(s4);
	
		
		System.out.println("\nDigite 1 calcular o salario pelo setor ou 2 p/ calcular pelo bairro: ");
		int cc = in.nextInt();
		if(cc==1)
			f2.calcSalario();
		else
			f2.calcSalario(palavra);
		
		System.out.println("\n-----------------------------------------");
		System.out.println("Digite o id do funcionario");
		f3.setFunid(in.nextInt());
		
		System.out.println("Digite o nome do funcionario");
		f3.setFunnome(in.next());
		
		System.out.println("\nO bairro 1: "+b1.getBainome());
		System.out.println("O bairro 2: "+b2.getBainome());
		System.out.println("O bairro 3: "+b3.getBainome());
		System.out.println("O bairro 4: "+b4.getBainome());
		
		System.out.println("\nDigite o numero correspondente ao bairro que vc mora: ");
		int aaa = in.nextInt();
		
		if(aaa==1)
			f3.setFunbairro(b1);
		else if(aaa==2)
			f3.setFunbairro(b2);
		else if(aaa==3)
			f3.setFunbairro(b3);
		else if(aaa==4)
			f3.setFunbairro(b4);
		else 
			System.out.println("\n*******  Bairro Inexistente !    *******");
		
		System.out.println("\nO setor 1: "+s1.getSetnome());
		System.out.println("O setor 2: "+s2.getSetnome());
		System.out.println("O setor 3: "+s3.getSetnome());
		System.out.println("O setor 4: "+s4.getSetnome());
		
		System.out.println("\nDigite o numero correspondente ao setor que vc trabalha: ");
		int bbb = in.nextInt();
		if(bb==1)
			f3.setFunsetor(s1);
		else if(bbb==2)
			f3.setFunsetor(s2);
		else if(bbb==3)
			f3.setFunsetor(s3);
		else if(bbb==4)
			f3.setFunsetor(s4);
	
		
		System.out.println("\nDigite 1 calcular o salario pelo setor ou 2 p/ calcular pelo bairro: ");
		int ccc = in.nextInt();
		if(ccc==1)
			f3.calcSalario();
		else
			f3.calcSalario(palavra);
		
		
		System.out.println("\nO ID do FUNCONARIO: "+f1.getFunid());
		System.out.println("O nome do FUNCONARIO: "+f1.getFunnome());
		System.out.println("O bairro do FUNCONARIO: "+f1.getFunbairro().getBainome());
		System.out.println("O setor do FUNCONARIO: "+f1.getFunsetor().getSetnome());
		System.out.println("O salario do FUNCONARIO: R$ "+f1.getFunsalario());
		
		System.out.println("\n\nO ID do FUNCONARIO: "+f2.getFunid());
		System.out.println("O nome do FUNCONARIO: "+f2.getFunnome());
		System.out.println("O bairro do FUNCONARIO: "+f2.getFunbairro().getBainome());
		System.out.println("O setor do FUNCONARIO: "+f2.getFunsetor().getSetnome());
		System.out.println("O salario do FUNCONARIO: R$ "+f2.getFunsalario());
		
		System.out.println("\n\nO ID do FUNCONARIO: "+f3.getFunid());
		System.out.println("O nome do FUNCONARIO: "+f3.getFunnome());
		System.out.println("O bairro do FUNCONARIO: "+f3.getFunbairro().getBainome());
		System.out.println("O setor do FUNCONARIO: "+f3.getFunsetor().getSetnome());
		System.out.println("O salario do FUNCONARIO: R$ "+f3.getFunsalario());
	}

}
