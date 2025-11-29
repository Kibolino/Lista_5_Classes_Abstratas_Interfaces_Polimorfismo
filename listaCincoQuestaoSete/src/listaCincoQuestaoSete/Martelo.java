package listaCincoQuestaoSete;

public class Martelo implements Ferramenta {

	@Override
	public void usar() {
		System.out.println("Usando o martelo");
	}

	@Override
	public void manter() {
		System.out.println("Limpando o martelo");
	}
}
