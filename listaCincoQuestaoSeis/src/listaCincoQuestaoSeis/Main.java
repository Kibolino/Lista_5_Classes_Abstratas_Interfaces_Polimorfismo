package listaCincoQuestaoSeis;

public class Main {

	public static void main(String[] args) {
		Forma[] formas = { new Circulo(3), new Retangulo(4, 5) };

		for (Forma f : formas) {
			System.out.println("Área: " + f.calcularArea());
		}

	}

}
