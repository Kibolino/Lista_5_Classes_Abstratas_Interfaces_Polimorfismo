package listaCincoQuestaoTres;

public class Pato implements Voar, Nadar {

	@Override
	public void decolar() {
		System.out.println("O pato está decolando");
	}

	@Override
	public void mergulhar() {
		System.out.println("O pato está mergulhando");
	}
}
