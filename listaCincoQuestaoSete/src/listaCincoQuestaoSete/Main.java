package listaCincoQuestaoSete;

public class Main {

	public static void main(String[] args) {
		Ferramenta[] fs = { new Martelo(), new Serra(), new ChaveDeFenda() };

		for (Ferramenta f : fs) {
			f.usar();
			f.manter();
		}

	}

}
