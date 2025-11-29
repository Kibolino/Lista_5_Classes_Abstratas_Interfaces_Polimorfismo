package listaCincoQuestaoDez;

public class Main {

	public static void main(String[] args) {
		Transacao[] lista = { new CartaoDeCredito(120), new Boleto(80) };

		for (Transacao t : lista) {
			t.executarTransacao();
		}

	}

}
