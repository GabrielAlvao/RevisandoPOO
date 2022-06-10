package carro;

public class Carro {
	private String cor;
	private String modelo;
	private double velocidadeAtual = 0;
	private double velocidadeMaxima;
	
	public Carro(String cor, String modelo,double velocidadeMaxima) {
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	void liga()
	{
		System.out.println("O Carro está ligado");
	}
	void acelera(double quantidade)
	{
		double velocidadeNova = velocidadeAtual+quantidade;
		velocidadeAtual = velocidadeNova;
	}
	int pegaMarcha()
	{
		if(this.velocidadeAtual < 0) {
			return -1;
		}
		if(this.velocidadeAtual >= 0 && this.velocidadeAtual <= 40) {
			return 1;
		}
		if(this.velocidadeAtual > 40 && this.velocidadeAtual <= 80) {
			return 2;
		}
		return 3;
	}
	public String getCor() {
		return cor;
	}
	public String getModelo() {
		return modelo;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	
}
