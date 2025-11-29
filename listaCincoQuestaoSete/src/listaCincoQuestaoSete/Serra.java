package listaCincoQuestaoSete;

public class Serra implements Ferramenta {

	@Override
	public void usar() {
		System.out.println("Usando a serra");
	}

	@Override
	public void manter() {
		System.out.println("Afiando a serra");
	}
}
