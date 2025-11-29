package listaCincoQuestaoQuatro;

public class Main {

	public static void main(String[] args) {
		Funcionario g = new Gerente("Carlos", 5000);
		Funcionario a = new Analista("Marcos", 4000);

		System.out.println("Bônus do gerente: " + g.calcularBonus());
		System.out.println("Bônus do analista: " + a.calcularBonus());

	}

}
