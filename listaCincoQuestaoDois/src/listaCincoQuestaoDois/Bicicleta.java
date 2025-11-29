package listaCincoQuestaoDois;

public class Bicicleta implements Transporte {
	@Override
	public void mover() {
		System.out.println("A bicicleta está andando");
	}

	@Override
	public void parar() {
		System.out.println("A bicicleta parou");
	}
}
