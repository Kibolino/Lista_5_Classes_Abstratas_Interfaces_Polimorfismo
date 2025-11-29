package listaCincoQuestaoDois;

public class Main {

	public static void main(String[] args) {
		Garagem g = new Garagem();

		Transporte carro = new Carro();
		Transporte bike = new Bicicleta();

		g.adicionarTransporte(carro);
		g.adicionarTransporte(bike);

	}

}
