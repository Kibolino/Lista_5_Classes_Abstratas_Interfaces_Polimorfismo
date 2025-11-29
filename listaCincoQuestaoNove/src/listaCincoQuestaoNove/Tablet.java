package listaCincoQuestaoNove;

public class Tablet extends Dispositivo implements Eletronico {

	public Tablet(String marca, String modelo) {
		super(marca, modelo);
	}

	@Override
	public void ligar() {
		System.out.println("Tablet ligado");
	}

	@Override
	public void desligar() {
		System.out.println("Tablet desligado");
	}
}
