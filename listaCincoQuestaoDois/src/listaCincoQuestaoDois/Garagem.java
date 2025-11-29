package listaCincoQuestaoDois;

public class Garagem {

	public void adicionarTransporte(Transporte t) {
		System.out.println("Transporte adicionado:");
		t.mover();
		t.parar();
	}
}
