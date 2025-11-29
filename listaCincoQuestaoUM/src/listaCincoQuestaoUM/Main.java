package listaCincoQuestaoUM;

public class Main {

	public static void emitirSom(Animal a) {
		a.fazerSom();
	}

	public static void main(String[] args) {
		emitirSom(new Cachorro());
		emitirSom(new Gato());
		emitirSom(new Pato());

	}

}
