package listaCincoQuestaoNove;

public class Main {

	public static void main(String[] args) {
		Eletronico[] lista = { new Celular("Samsung", "A30"), new Tablet("Apple", "iPad") };

		for (Eletronico e : lista) {
			e.ligar();
			e.desligar();
		}

	}

}
