package carro;

public class Teste {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Preto", "Fiesta",180);
		carro1.liga();
		carro1.acelera(40);
		carro1.acelera(50);
		System.out.println(carro1.getVelocidadeAtual());
		System.out.print(carro1.pegaMarcha());
	}

}
